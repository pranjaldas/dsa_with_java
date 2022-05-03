import java.util.ArrayList;

public class Test {
    public static void main(String[] args){
        String str= "Hii";
        String str1= "Hii";
        System.out.println(str.hashCode() +" "+str1.hashCode());
        Runnable runnable= new Runnable() {
            @Override
            public void run() {
                System.out.println("Hellow Task");
            }
        };
        Thread t1= new Thread(runnable);
        t1.start();
        Testable testable= () -> System.out.println("going");
        testable.go();
        testable.sayHii();

    }
}
@FunctionalInterface
interface Testable{
    void go();
    default void sayHii(){
        System.out.println("Ok Hi, Hellow");
    }
}
