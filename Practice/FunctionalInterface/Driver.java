public class Driver {
    public static void main(String[] args){
        // USING ANNONYMOUS INNER CLASS
        Add add= new Add(){
            @Override
            public int add(int a,int b){
                return a+b;
            }
        };
        System.out.println("The sum is "+add.add(1,2));
        // NOW USING LEMDA FUNCTIONS:
        Add add2= (a,b)->a+b;
        System.out.println("The sum is "+add2.add(1,2));
    }
    
}
