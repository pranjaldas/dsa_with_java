import java.util.*;
class Driver{
    public static void main(String[] args){
        genericsTest(123);
        // DEMONSTRATE PRINTER WITH DIFFERENT TYPE PARAMETER,GENERICS
        Printer<Integer> printer= new Printer<>(556);
        printer.print();
        Printer<String> stringPrinter= new Printer<>("HP 515 printer");
        stringPrinter.print();
        // TO DEMONSTAR GENERICS
        AnimalPrinter<Cat> catPrinter= new AnimalPrinter(new Cat("Meew",4));
        catPrinter.print();
        AnimalPrinter<Dog> dogPrinter= new AnimalPrinter(new Dog("Vow Vow",32));
        dogPrinter.print();
        // TO DEMONSTRATE WILDCARDS 
        // NO BOUNDS
        System.out.println("------------------");
        List<Animal> listOne= new ArrayList<>();
        listOne.add(new Dog("Vow Vow",32));
        listOne.add(new Cat("Meew",4));
        printListNoBounded(listOne);

        // UPPER BOUNDS
        System.out.println("------------------");
        List<Cat> listTwo= new ArrayList<>();
        listTwo.add(new Cat("Meew",4));
        printList(listTwo);

        System.out.println("*****************");
        Storage<Animal> storage= new Storage<>();
        storage.store(listOne);

        // LOWER BOUND
        System.out.println("______LOWERBOUND__________");
        List<Animal> animalList= new ArrayList<>();
        store(animalList);
        // THE BOLOW WILL GIVE COMPILATION ERROR BECAUSE OF LOWER BOUND 
        // TO METHOD store(List list) ACCEPTS LISTS WHICH ARE LIST OF SUPERTYPE OF 
        // CATS, SINCE REDCAT IS NOT SUPER OF CAT AND WE HAVE PASSED A REDCAT LIST SO IT IS 
        // GIVING COMPILE TIME ERROR
        // List<RedCat> redcatlist= new ArrayList<>();
        // store(redcatlist);



       
    }
    // DEMONSTRATE TO GENERIC METHODS, WITH GENERIC ARGUMENTS
    public static <T> void genericsTest(T value){
        System.out.println(value);
    }
    // DEMONSTRATE TO UNBOUNDED WILDCARDS
    public static void printListNoBounded(List<?> list){
        list.forEach(i->System.out.println(i.toString()));
    }
    // DEMONSTRATE TO UPPER BOUNDED WILDCARDS
    public static void printList(List<? extends Animal> list){
        list.forEach(i->System.out.println(i.toString()));
    }
    public static void store(List<? super Cat> list){
        list.add(new RedCat());
        System.out.println("Cat added"+list.get(0));
    }

}