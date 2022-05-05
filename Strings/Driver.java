class Driver{
    public static void main(String[] args){
        // DECLARING A STRING
        String str1= "MYSTRING1";
        String str2= new String("MYSTRING2");

        // STRING CONCATINATION
        System.out.println(str1+str2);
        System.out.println(str1.concat(str2));

        // STRING COMPARISION, COMPARETO METHOD COMPARES TWO STRING LENGTH BY DEFAULT WE CAN
        System.out.println(str1==str2);
        System.out.println("COMPARISION: "+str1.compareTo(str2));
        System.out.println("COMPARISION: "+str1.equals(str2));
        System.out.println("IGNORECASE :"+"Hii".equalsIgnoreCase("hii"));

        // SUBSTRING
        System.out.println("SUBSTRING".substring(1,3));
        System.out.println("SUBSTRING".substring(3));

        


    }
    
}