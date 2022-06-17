public class MyPrinter{
    int data;
    MyPrinter(){
    }
    public void setData(int data){
        this.data= data;
    }  
    public int print(){
        return data;
    }   
}
class Producer implements Runable{
    MyPrinter printer;
    Producer(MyPrinter printer){
        this.printer= printer;
    }
    @Override
    public void run(){
        int data= 0;
        int counter= 0;
        while(counter < 100){
            data++;
            printer.setData(data);
            counter++;
        }
    } 
}
class Consumer implements Runable{
    MyPrinter printer;
    Consumer(MyPrinter printer){
        this.printer= printer;
    }
    @Override
    public void run(){
        int data= 0;
        int counter= 0;
        while(counter < 100){
            data++;
            printer.setData(data);
            counter++;
        }
    } 
}
public class InterThreadCommunication {
    public static void main(String[] args){
        
    }
}
