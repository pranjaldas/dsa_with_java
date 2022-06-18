import java.lang.*;
class Task implements Runnable{
    private String threadName;
    private int remainder;
    Task(String name,int remainder){
        this.threadName= name;
        this.remainder= remainder;
    }
    @Override
    public void run(){
        while(Test.number< Test.MAX_COUNT-1){
            synchronized (Test.monitor){
                while(Test.number % 3 != remainder){
                    try {
                        Test.monitor.wait();
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }
                System.out.println(threadName+" "+Test.number);
                //System.out.println(Thread.currentThread().getName()+" "+Test.number);

                Test.number++;
                Test.monitor.notifyAll();
            }
        }
       
    }
}

class Test {
    public static int number=1;
    public static int MAX_COUNT=10;
    static Object monitor= new Object();
    public static void main(String args[]){

        new Thread(new Task("T1",1)).start();
        new Thread(new Task("T2",2)).start();
        new Thread(new Task("T3",0)).start();
        
    }
   
}
