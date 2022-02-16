// FIND THE Nth POWER OF NUMBER X
class Powerofnumber{
    public static void main(String[] args) {
        System.out.println("power of: "+powerOfRecursion(3,4));
    }
    // CALCULATING POWER USING ITERATION
    public static int powerOf(int base, int exp){
        int power =1;
        for(int i=1; i<=exp; i++){
            power = base * power;
        }
        return power;
    }
    public static int powerOfRecursion(int base, int exp){
        if(exp ==1)
            return base;
        else
            return base * powerOfRecursion(base, exp -1);
    }
}