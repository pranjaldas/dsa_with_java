import java.util.Arrays;  
class ReverseArray{
    public static void main(String args[]) throws Exception{
        int arr[]= {1,2,3,4,5,6,7};
        System.out.println("The array is: "+Arrays.toString(reverseArrayNew(arr)));
    }
    public static int[] reverseArray(int[] arr){
        // THIS IS THE EFFICIENT WAY OF REVERSE THE O(n/2)=O(n) COMPLEXITY
        // AFTER REMOVING 1/2 CONSTANT 
        int temp= 0;
        for(int i=0; i<arr.length/2;i++){
            temp=arr[i];
            arr[i]=arr[arr.length-i-1];
            arr[arr.length-i-1]=temp;
        }
        return arr;
    }
    public static int[] reverseArrayNew(int[] arr){
        // THIS IS THE BRUTE FORCE WAY OF REVERSING WITH COMPLEXITY O(n) 
        // WITH ADDITIONAL MEMORY OF CREATING NEW ARRAY
        int newArr[] = new int[arr.length];
        int j=0;
        for(int i=arr.length-1; i>=0;i--){
           newArr[j]=arr[i];
           j++;
        }
        return newArr;
    }
}