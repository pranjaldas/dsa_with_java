import java.util.*;
class Palindrome{
    static boolean checkPalindrome(String input){
        char arr[]= input.toCharArray();
        int j=arr.length-1;
        boolean result=true;
        for(int i=0;i<=arr.length/2-1;i++){
            if(arr[i]==arr[j]){
                result=true;
            }else{
                result=false;
                break;
            }
            j--;
        }
        return result;
    }
    static boolean isPalindrome(String str)
    {
 
        // Pointers pointing to the beginning
        // and the end of the string
        int i = 0, j = str.length() - 1;
 
        // While there are characters to compare
        while (i < j) {
 
            // If there is a mismatch
            if (str.charAt(i) != str.charAt(j))
                return false;
 
            // Increment first pointer and
            // decrement the other
            i++;
            j--;
        }
 
        // Given string is a palindrome
        return true;
    }
    public static void main(String[] args) {
       System.out.println(checkPalindrome("MOriOM"));
    }
}