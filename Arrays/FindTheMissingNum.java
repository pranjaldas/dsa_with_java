// FIND THE MISSING NUMBER FROM A ARRAY OF CONSECUTIVE POSITIVE INTEGER ARRAY.
public class FindTheMissingNum {
    public static void main(String[] args) throws Exception {
        //  WE KNOW THAT FROM MATHS SUM OF CONSECUTIVE POSITIVE INTEGERS n(n+1)/2
        // WHERE n IS THE LAST INTEGER, IN THIS CASE LAST INTEGER IS 20
        int myArray[] = {1,2,3,4,5,6,7,8,9,10,12,13,14,15,16,17,18,19,20};
        int predictedSum= 20* (20+1) /2;
        int actualSum= 0;
        for(int i:myArray){
            actualSum += i;
        }
        System.out.println("The missing number is: "+(predictedSum-actualSum));
    }
}
