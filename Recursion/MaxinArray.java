 import java.lang.*;
class MaxinArray{
    public static void main(String[] args){
        int[] arr = new int[]{1,5,61,2,72};
        System.out.println("Largesr in the array is: "+findMax(arr,arr.length));
    }
    //  WITHOUT USING RECURSION
    public static int findMaxIterate(int[] arr, int size){
        int largest = arr[0];
        for (int i = 1; i < size; i++){
            if(arr[i] > largest){
                largest = arr[i];
            }
        }
        return largest;
    }

    // USING RECURSION
    public static int findMax(int[] arr, int size){
        if(size == 1){
            return arr[0];
        }
        return Math.max(arr[size-1], findMax(arr,size-1));
    }

}