import java.util.Arrays;

/**
 * REMOVE A GIVEN ELEMENT IN ARRAY AND SHIFT THE ARRAY 
 * CHECK FOR THE DUPLICATES ALSO
 */
public class RemoveGivenElement {
    public static void main(String[] args){
        Integer[] array= {12,7,78,3,0,24,7,-1};
        removeDuplicate(array,7);
    }
    public static void removeDuplicate(Integer[] array,Integer number){
        for(int i=0; i<array.length;i++){
            if(array[i] == number){
                // HERE WE ARE SHIFTING THE ELEMENTS
                for(int j=i; j< array.length;j++){
                    if(j<array.length-1){
                        array[j]=array[j+1];
                    }else if(j== array.length-1){
                        array[j]=Integer.MIN_VALUE;
                    }
                }
            } 
        }
        System.out.println(Arrays.toString(array));
        
        
    }
}
