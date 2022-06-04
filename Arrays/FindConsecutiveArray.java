/**
 * Write a program to find length of longest consecutive sequence in array of integers?
 * also find the sub-array. 
 */
import java.io.*;
import java.util.*;

public class FindConsecutiveArray {
    public static void main(String[] args){
        int[] array= {1, 9, 3, 10, 4, 20, 2, 3};
        int[] array2= {1, 4, 6, 10, 4, 20, 14, 17};
        findTheConsecutive(array2);
    }
    // SORT THE ARRAY FIRST
    // REMOVE THE DUPLICATES
    // CREATE A ARRAYLIST TO STORE THE LONGEST SEQENCE
    // DECLARE TWO VARIABLE COUNT 
    // IN A FOR LOOP CHECK IF NEXT NO IS CONSECUTIVE 
    // IF YES ADD IN THE SUBARRAY AND INCREMENT COUNT 
    // IF NO THEN EMPTY THE SUB ARRAY, SET COUNT TO 0, ADD THE ELEMENT IN THE SUBARRAY
    // AND FIND THE LENGTH OF THE SUBARRAY

    public static void findTheConsecutive(int[] array){
       //HERE I AM NOT CONCERNED ABOUT THE MEMORY
       //Arrays.sort(array);
       System.out.println(Arrays.toString(array));
        //    List<Integer> list = new ArrayList<>();
        //    for(int i=0 ;i< array.length; i++){
        //         if(!list.contains(array[i])){
        //             list.add(array[i]);
        //         }
        //    }
        //I AM USING TREESET BECAUSE IT DO NOT ALLOW DUPLICATES AND MAINTAINS THE ELEMENTS SORTED
       Set<Integer> set = new TreeSet<>();
       for(int i=0 ;i< array.length; i++){
          set.add(array[i]);
       }
       System.out.println(set);

    //    HERE I NEED TO USE THE FORMUAL n*n-1/2 to find the sum o

       List<Integer> consecutives= new ArrayList<>();
       Integer lastConsLength= 0;

       Integer[] arraynew= set.toArray(new Integer[0]);
     
        for(int i=0; i< arraynew.length-1;i++){
            int j=i+1;
            int a= arraynew[i]+1;
            int b= arraynew[j];
            consecutives.add(array[i]);
            System.out.println(String.format("a: %d and b: %d size: %d",a,b,consecutives.size()));
            if(a!=b){
                if(consecutives.size() > lastConsLength){
                    System.out.println("I am here");
                    lastConsLength= consecutives.size();
                }
                consecutives.clear();
                System.out.println("I AM HER: "+ lastConsLength);
                
            }
            
            
        }  
      
       
       System.out.println(lastConsLength);
       
    }
}
