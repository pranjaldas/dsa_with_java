import java.lang.*;
/*
 *  print sequence
 *  T1 1
 *  T2 2
 *  T3 3
 *  T1 4
 *  T2 5
 *  T3 6
 * .... using Three threads
 */
class PrintSequenceRunnable implements Runnable{
 
    public int PRINT_NUMBERS_UPTO=12;
    static int  number=1;
    int remainder;
    static Object lock=new Object();
 
    PrintSequenceRunnable(int remainder)
    {
        this.remainder=remainder;
    }
 
    @Override
    public void run() {
        while (number < PRINT_NUMBERS_UPTO-1) {
            synchronized (lock) {
               while (number % 3 != remainder) {
                    try {
                        lock.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
              System.out.println(Thread.currentThread().getName() + " " + number);
              number++;
              lock.notifyAll();
            }
        }
    }
}
class PrintSequence {
    public static void main(String[] args){
        new Thread(new PrintSequenceRunnable(1),"T1").start();
        new Thread(new PrintSequenceRunnable(2),"T2").start();
        new Thread(new PrintSequenceRunnable(0),"T3").start();
 
    }
}

