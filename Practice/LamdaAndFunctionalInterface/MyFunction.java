import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
/*
 * Here Function in a functional interface in java.util.function package
 * We can have a reference of the interface and implement the method apply() 
 * and use it. 
 */
public class MyFunction {
    public static void main(String[] args){
        Function<String, Integer> function= x-> x.length();
        Integer returndata= function.apply("Pranjal");
        System.out.println(returndata);
        //USING andThen() default method of the functional interface
        Function<Integer, Integer> function2= x->x+25;
        Integer integer= function.andThen(function2).apply("Pranjal");
        System.out.println(integer);
        MyFunction myFunction= new MyFunction();
        List<String> myList= Arrays.asList("Pranjal", "Das","name");

        List<Integer> myResults= map(myList, myFunction::convert);
        myResults.forEach(System.out::println);
        System.out.println(test(new Integer(2),new String("Pranjal")));

    }
    public static <T,R> List<R> map(List<T> list, Function<T,R> function){
        List<R> result= new ArrayList<>();
        for(T t: list){
            result.add(function.apply(t));
        }
        return result;
    }

    public Integer convert(String str){
        Integer sum= 0;
        for(int i=0; i<str.length();i++){
            sum+= str.charAt(i);
        }
        return sum;
    }
    public static <T,S> S test(T data,S data1){
        return data1;
    }
}
