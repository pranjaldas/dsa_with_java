class DriverClass{
    public static void main(String[] args){
        ThreeInOne threeInOne= new ThreeInOne(5);
        System.out.println(threeInOne.getTopIndex(1));
        threeInOne.push(1,23);
        threeInOne.push(1,2);
        threeInOne.push(1,16);
        threeInOne.push(1,2);
        System.out.println("Popped item is: "+threeInOne.pop(1));
        threeInOne.print();
    }
}