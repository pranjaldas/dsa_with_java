import java.lang.reflect.Array;
import java.util.Arrays;

/**
 *  REVERSE IS EASE BUT HERE WE COULD NOT USE ANY EXTRA SPACE OF O(N)
 *  NOW THAT IS THE TRICK HERE 
 */
public class ReverseInPlace {
    public static void main(String[] args){
        int[] array= {1,2,3,4,5,6,7};
        System.out.println(Arrays.toString(array));
        array = reverseArray(array);
        System.out.println(Arrays.toString(array));
    }
    public static int[] reverseArray(int[] array){
        int length= array.length;
        int middle= array.length/2;
        int j=length-1;
        for(int i=0;i<middle;i++){
            int temp= array[i];
            array[i]= array[j];
            array[j]=temp;
            j--;
        }
        return array;
    }
}
