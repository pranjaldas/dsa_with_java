// FIND ALL THE PAIRS OF INTEGERS IN A GIVEN ARRAY OF INTEGERS
// WHOSE SUM IS A GIVEN INTEGER
import java.util.*;
public class TwoSumPairs {
    public static void main(String[] args)throws Exception {
        int myArray[]= {1,3,5,7,2,8,5};
        System.out.println("The pairs are: "+Arrays.toString(twoSumPairs(myArray,18)));
    }
    // IN THIS CASE WE RETURNED ONCE WE FOUND THE FIRST PAIR OF INTEGES
    // WE COULD KEEP ON CALCULATING AND SEND BACK THE COUNT OF PAIRS ALSO
    public static int[] twoSumPairs(int[] array,int target){
        for(int i=0;i<array.length;i++){
            for(int j=i+1;j<array.length;j++){
                if(array[i]+array[j]==target){
                    // HERE WE ARE RETURNING THE INDEXES ONLY
                    return new int[]{i,j};
                }
            }
        }
        throw new IllegalArgumentException("No pairs found");
    }
}
