class ReverseString{
    public static void main(String[] args) throws Exception{
        String s= "reverse";
        System.out.println(reverse(s));
    }
    public static String reverse(String str){
        if (str.isEmpty())
            return str;
        //Calling Function Recursively
        return reverse(str.substring(1)) + str.charAt(0);
    }
}