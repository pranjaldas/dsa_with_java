import java.lang.*;
class MyPrinter{
    int data;
    boolean isSet= false;
    MyPrinter(){
    }
    public synchronized void  setData(int data){
        
        while(isSet){
            try {
                wait();
            } catch (Exception e) {
                //TODO: handle exception
            }
        }
        System.out.println("@ Producing data: "+ data);
        this.data= data;
        isSet=true;
        notify();
        
    }  
    public synchronized void getData(){
        while(!isSet){
            try {
                wait();
            } catch (Exception e) {
                //TODO: handle exception
            }
        }
        System.out.println("# Consuming data: "+ data);
        isSet=false;
        notify();
    }   
}
class Producer implements Runnable{
    MyPrinter printer;
    Producer(MyPrinter printer){
        this.printer= printer;
    }
    @Override
    public void run(){
        int data= 0;
        int counter= 0;
        while(counter < 10){
            data++;
            printer.setData(data);
            counter++;
        }
    } 
}
class Consumer implements Runnable{
    MyPrinter printer;
    Consumer(MyPrinter printer){
        this.printer= printer;
    }
    @Override
    public void run(){
        int counter= 0;
        while(counter < 10){
            try {
                Thread.sleep(1000);
            } catch (Exception e) {
                //TODO: handle exception
            }
            printer.getData();
            counter++;
        }
    } 
}
class InterThreadCommunication {
    public static void main(String[] args){
        MyPrinter printer = new MyPrinter();
        Runnable producer= new Producer(printer);
        Runnable consumer= new Consumer(printer);
        Thread pThread= new Thread(producer,"Producer");
        Thread cThread= new Thread(consumer,"Consumer");
        pThread.start();
        // try {
        //     pThread.join(); 
        // } catch (Exception e) {
        //     //TODO: handle exception
        // }
        
        cThread.start();
    }
}
