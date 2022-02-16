// GCD GREATEST COMMON DIVISOR
class GCD{
    public static void main(String[] args){
        System.out.println("GCD GREATEST COMMON DIVISOR :"+findGCD(4,2));
    }
    public static int findGCD(int a ,int b){
        if(b==0)
            return a;
        else
            return findGCD(b,a%b);

    }
}