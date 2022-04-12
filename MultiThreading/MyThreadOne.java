import java.lang.Thread;
class MyThreadOne extends Thread {
    Printer printer;
    String name;
    MyThreadOne(Printer printer,String name){
        this.printer= printer;
        this.name=name;
    }
    @Override
    public void run(){
        this.printer.print(this.name);
    }
}