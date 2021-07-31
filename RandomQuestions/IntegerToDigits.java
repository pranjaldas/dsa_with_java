// PROGRAM TO CONVERT A NUMBER INTO DIGITS
import java.util.*;
class IntegerIntoDigits{
    public static void main(String args[]){
        int num= 34691;
        Stack<Integer> digits= new Stack<Integer>();
        while(num>0){
            digits.push(num%10);
            num = num / 10;
        }
        System.out.println(digits.size());
        while(!digits.empty()){
            System.out.println(digits.pop());
        }
    }
    
}