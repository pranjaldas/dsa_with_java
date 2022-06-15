public class CheckIfPrime {
    public static void main(String[] args){
        System.out.print("Is prime:"+check(7));
    }
    public static boolean check(int number){
        int middle= number/2;
        int start=2;
        while(start<=middle){
            System.out.println("Start:"+start+", middle: "+middle+"result: "+(number%start));
            if(number%start==0)
                return false;
            else
                start++;
        }
        return true;
    }
}
