/**
 * FIND THE LARGEST AND THE SMALLEST ELEMENTS FROM AN UNSORTED ARRAY
 */
public class FindLargestAndSmallest {
    public static void main(String[] args){
        Integer[] array= {12,6,78,3,0,24,7,-1};
        findLargestAndSmallest(array);
    }
    public static void findLargestAndSmallest(Integer[] array){
        Integer largest=Integer.MIN_VALUE;
        Integer smallest=Integer.MAX_VALUE;
        for(int i=0; i<array.length;i++){
            if(array[i] >= largest){
                largest=array[i];
            }
            if(array[i]< smallest){
                smallest=array[i];
            }
        }
        System.out.println("Find largest and smallest: "+largest+" and "+ smallest);
    }
}
