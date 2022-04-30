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
       
    }
    // DEMONSTRATE TO GENERIC METHODS, WITH GENERIC ARGUMENTS
    public static <T> void genericsTest(T value){
        System.out.println(value);
    }
}