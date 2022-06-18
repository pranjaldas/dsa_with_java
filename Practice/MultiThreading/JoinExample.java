class MyTask implements Runnable{
    String threadName;
    MyTask(String threadName){
        this.threadName=threadName;
    }
    @Override
    public void run(){
        for(int i=0;i<3;i++){
            System.out.println(this.threadName+" "+i);
        }
    }
}



public class JoinExample {
    public static void main(String[] args){
        Thread t1=new Thread(new MyTask("T1"));
        Thread t2=new Thread(new MyTask("T2"));
        Thread t3=new Thread(new MyTask("T3"));
        
        try {
            t1.start();
            t1.join();
            t2.start();
            t2.join();
            t3.start();
        } catch (Exception e) {
            //TODO: handle exception
        }

        // t1.start();
        // t2.start();
        // t3.start();
        
        

    }
    
}
