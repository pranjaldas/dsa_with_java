
import package1.*;
import package2.*;
class Driver{
    public static void main(String[] args){
        Parent parent = new Parent();
        Animal a= new Animal("Animal");
        System.out.println("hellow :"+parent.getName());
        System.out.println("hellow :"+a.getName());
    }
}