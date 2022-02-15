//FIND SUM OF DIGITS TILL GIVEN NUMBER USING RECURSION
public class Sumofdigits {
    public static void main(String[] args) {
        System.out.println("Sum of digits : "+sumofdigits(3));
    }
    public static int sumofdigits(int n){
        if(n== 1){
            return 1;
        }else{
            return n + sumofdigits(n-1);
        }
        
    }
    
}
