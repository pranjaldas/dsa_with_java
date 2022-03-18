public class Main {
    public static void main(String args[]){
        // FUNCTIONAL INTERFACE IMPLEMENTATION USING A SEPERATE CLASS IMPLEMENTATION
        System.out.println("Function interface implementation using class implementation:");
        // REFERENCE OF AN INTERFACE AND OBJECT OF A CLASS
        FunctionalInterface<Integer> implObj = new Laptop("LENOVO",78000,4);
        System.out.println(implObj.getSpeed(2));

        // FUNCTIONAL INTERFACE IMPLEMENTATION USING ANNONYMOUS INNER CLASS
        FunctionalInterface<Integer> obj1= new FunctionalInterface<Integer>() {
            @Override
            public Integer getSpeed(Integer integer){
                return integer * 2;
            }
        };
        System.out.println(obj1.getSpeed(2));
        // FUNCTION INTERFACE IMPLEMENTATION USING LAMDA FUNCTIONS
        // WE DO NO NEED TO return STATEMENT BECAUSE IF IT RETURNS THE SAME 
        // INPUT TYPE IN THE FUNCTION DESCRIPTION
        // DO NOT NEED { }, IF THERE IS A SINLE LINE STATEMENT INSIDE THE FUNCTION BODY
        FunctionalInterface<Integer> obj2= (Integer integer)-> integer * 5;
        System.out.println(obj2.getSpeed(5));
    }
}
