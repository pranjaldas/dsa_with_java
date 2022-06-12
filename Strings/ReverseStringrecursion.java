public class ReverseStringrecursion {
    public static void main(String[] args){
        String string= "PRANJAL";
        char[] charArray= string.toCharArray();
        reverse(charArray,charArray.length-1);
        System.out.println("--------reverse a string using recursion---------");
        reverse(string,charArray.length-1);

    }
    public static void reverse(char[] charArray,int length){
        if(length>=0){
            System.out.print(charArray[length]);
            reverse(charArray, length-1);
        }else{
            return;
        }
    }
    public static void  reverse(String string, int index){
        if(index>=0){
            System.out.print(string.charAt(index));
            reverse(string, index-1);
        }else{
            return;
        }
    }
}
