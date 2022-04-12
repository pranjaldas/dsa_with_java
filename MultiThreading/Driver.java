public class Driver{
    public static void main(String[] args){
        /**
         * MIND THAT WE ARE USING ONLY ONE PRINTER OBJECT IN BOTH THE THREADS 
         * TO PRINT, I HAVE MADE THE PRINT() METHOD SYNCHRONIZED SO THAT AFTER T1 THREAD COMPLETES 
         * THE TASK T2 START ITS TASK 
         */
        Printer printer =new Printer();
        MyThreadOne t1= new MyThreadOne(printer,"@THREAD_1");
        t1.start();
        MyThreadOne t2= new MyThreadOne(printer,"#THREAD_2");
        t2.start();
    }
}