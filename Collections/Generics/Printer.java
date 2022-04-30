class Printer<T>{
    T thingsToPrint;
    Printer(T thingsToPrint){
        this.thingsToPrint= thingsToPrint;
    }
    public void print(){
        System.out.println(thingsToPrint);
    }
}