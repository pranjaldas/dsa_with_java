import java.util.*;
class Laptop implements FunctionalInterface<Integer>{
    private String name;
    private int price;
    private int ram;
    public Laptop(){

    }
    public Laptop(String name,int price,int ram){
        this.name = name;
        this.price = price;
        this.ram = ram;
    }
    public void setName(String name){
        this.name = name;
    }
    public void setPrice(int price){
        this.price = price;
    }
    public void setRam(int ram){
        this.ram = ram;
    }
    public String getName(){
        return this.name;
    }
    public int getPrice(){
        return this.price;
    }
    public int getRam(){
        return this.ram;
    }
    @Override
    public Integer getSpeed(Integer integer){
        return this.getRam()* integer;
    }
   
}