class MethodHiding{
    public static void main(String[] args){
        Parent.foo();
        Child.foo();
        Parent c1= new Child();
        c1.foo();
    }
}
class Parent{
    public static void foo(){
        System.out.println("Hii from Parent");
    }
}
class Child extends Parent{
    public static void foo(){
        System.out.println("Hii from Child");
    }
}