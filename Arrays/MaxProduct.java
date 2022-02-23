// FIND THE PAIR WHOSE PRODUCT IS MAXIMUM, CONSIDERING NO SAME NUMBER
import java.util.*;
public class MaxProduct {
    public static void main(String[] args) throws Exception {
        int myArray[]= {1,3,5,7,2,8,5};
        System.out.println("The pairs are: "+Arrays.toString(maxProduct(myArray)));
    }
    public static int[] maxProduct(int[] myArray){
        int largestProduct= 1;
        int[] pairs =new int[3];
        for(int i=0;i<myArray.length;i++){
            for(int j=i+1;j<myArray.length;j++){
                if(myArray[i]* myArray[j] > largestProduct){
                    largestProduct= myArray[i]* myArray[j];
                    pairs = new int[]{myArray[i],myArray[j],largestProduct};
                }

            }
        }
        return pairs;
    }
}
