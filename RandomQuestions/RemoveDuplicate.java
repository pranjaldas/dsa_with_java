// Write a program to remove duplicates from a unsorted array.
import java.util.*;
class RemoveDuplicate{
    public static void method1(int[] arr){
        // My first approach
        ArrayList<Integer> duplicates = new ArrayList<Integer>();

        for(int i=0; i<arr.length-1; i++) {
            for(int j=i+1; j<arr.length; j++) {
                if(arr[i]==arr[j]){
                    duplicates.add(j);
                }
            } 
        }
        for(int i=0; i<arr.length;i++){
            if(!duplicates.contains(i)){
                System.out.print(arr[i]);
            }
        }
    }
    public static void method2(int[] arr){
        ArrayList<Integer> duplicates = new ArrayList<Integer>();
        for(int i=0; i<arr.length;i++){
            if(!duplicates.contains(arr[i]))
                System.out.print(" "+arr[i]);
            duplicates.add(arr[i]);
        }

    }
    public static void main(String[] args){
        int arr[]= {1,4,5,5,1,3,9,9,10,3};
        method1(arr);
        method2(arr);
       

    }
}