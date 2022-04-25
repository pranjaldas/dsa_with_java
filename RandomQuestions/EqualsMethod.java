class Person{
    private String name;
    Person(){
        // DEFAULT CONSTRUCTOR
    }
    
    Person(String name){
        this.name= name;
    }
    public static boolean equals(Object o1,Object o){
        return true;
    }
    
}
class EqualsMethod{
    public static void main(String[] args){
        Person p1= new Person("Pranjal");
        Person p2= new Person("Pranjal");
        System.out.println("Check is equals"+Person.equals(p1,p2));
    }
}