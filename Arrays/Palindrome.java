import java.util.Arrays;
public class Palindrome{
    public static void main(String[] args){
        System.out.println(checkPalindrome("PRARPX"));
        System.out.println('x'+'A');
    }
    public static boolean checkPalindrome(String givenString){
        char[] arrayOfString = givenString.toCharArray();
        // char[] reverse= new char[arrayOfString.length];
        int j=0;
        boolean check= true;
        for(int i= arrayOfString.length-1; i>=0; i--){
            if(arrayOfString[i]!= arrayOfString[j]){
                check=false;
                break;
            }
            j++;
        }
        return check;

       
    }
}