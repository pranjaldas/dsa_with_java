// CONVERT DECIMAL NUMBERS TO BINARY NUMBERS
// FORMULA IS f(n) = n%2 + 10 * f(n/2)
// TERMINATION CONDITION IS WHEN THE QUOTIENT IS 0
class DecimaltoBinary{
    public static void main(String[] args){

        System.out.println("Binary of number "+deciToBinary(13));
    }
    public static int deciToBinary(int n){
        if(n== 0)
            return 0;
        else
            return n%2 + 10*deciToBinary(n/2);
    }
}