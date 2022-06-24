/*
 * SINCE JAVA DO NOT SUPPORT MULTIPLE INHERITANCE AND IT CREATES A DIAMOND PROBLEM 
 * SO WE USE INTERFACES TO ACHIEVE MULTIPLE INHERITANCE BY INTERFACES
 * 
 */
interface A{
    void say();
}
interface B{
    void say();
    default void ask(){
        System.out.println(
            "I am asking Hola madrid"
        );
    }
}
class Test implements B{
    @Override
    public void say(){
        System.out.println(
            "Hola madrid saying from Test class"
        ); 
    }
    @Override
    public void ask(){
        B.super.ask();
        System.out.println("I'm from ask of Test class");
    }
}

class Main implements A,B{
    @Override
    public void say(){
        System.out.println(
            "Hola madrid saying"
        ); 
    }
    public static void main(String aString[]){
        Main main= new Main();
        main.say();
        main.ask();
        B obj= new Test();
        obj.ask();
    }
}