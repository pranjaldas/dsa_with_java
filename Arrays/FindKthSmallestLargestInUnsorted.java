import java.util.Arrays;

public class FindKthSmallestLargestInUnsorted {
    public static void main(String[] args){
        Integer[] array= {2,4,9,3,5,90,45,12,39};
        find(array, 3);
    }
    public static void find(Integer[] array, Integer kth){
        if(kth> array.length){
            System.out.println("The given index is not applicable as larger than the array size.");
            return;
        }
        for(int i=0; i<array.length-1;i++){
            for(int j=0;j<array.length-i-1;j++){
                if(array[j]>array[j+1]){
                    int temp= array[j+1];
                    array[j+1]=array[j];
                    array[j]=temp;
                }
            }
        }
        System.out.println(Arrays.toString(array));
        System.out.println(kth+" no smallest: "+array[kth-1]);
        System.out.println(kth+" no largest: "+array[(array.length-kth)]);
    }
}
