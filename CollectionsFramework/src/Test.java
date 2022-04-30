import java.util.ArrayList;

public class Test {
    public static void main(String[] args){
//        Runnable runnable= new Runnable() {
//            @Override
//            public void run() {
//                System.out.println("Hellow Task");
//            }
//        };
//        Thread t1= new Thread(runnable);
//        t1.start();
//        Testable testable= () -> System.out.println("going");
//        testable.go();
//        testable.sayHii();
        List<T> list= new ArrayList<T>();
        
    }
}
@FunctionalInterface
interface Testable{
    void go();
    default void sayHii(){
        System.out.println("Ok Hi, Hellow");
    }
}
