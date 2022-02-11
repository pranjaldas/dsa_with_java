// CHECK RECURSION
public class Factorial {
    public static void main(String[] args){
        System.out.println("Factorial is: "+factorialOfNo(4));
    }
    public static int factorialOfNo(int n){
        if(n== 0 || n== 1)
            return 1;
        else
            return n * factorialOfNo(n-1);
    }
    
}
