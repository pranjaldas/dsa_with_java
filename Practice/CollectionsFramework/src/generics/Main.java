package generics;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String args[]) {
        List<Dog> dogList = new ArrayList<>();
        test2(dogList);
        List<Animal> animalList = new ArrayList<>();
        test1(animalList);
        test(dogList);
    }
    /**
     * UNBOUNDED GENERICS
     **/
    public static void test(List<?> obj){
        System.out.println(obj);
    }
    /**
     * UPPER BOUNDED GENERICS
     **/
    public static void test2(List<? extends Animal> obj){
        System.out.println(obj);
    }
    /**
     * LOWER BOUNDED GENERICS
     **/
    public static void test1(List<? super Dog> obj){
        System.out.println(obj);
    }


}
