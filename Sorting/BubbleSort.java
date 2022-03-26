import java.util.*;
public class BubbleSort {
    int[] array;
    int length;
    BubbleSort(int[] array){
        this.array= array;
        this.length= array.length;
    }
    public int[] sort(){
        // THIS ARRAY IS ONLY USED FOR TO MAINTAIN THE PASS
        for(int i= 0; i<this.length-1; i++){
            //  THIS 2nd ARRAY j IS GOINNG TO COMPARE THE PARES 
            for(int j= 0; j<this.length-i-1; j++){
                if(this.array[j] < this.array[j+1]){
                    // SWAPPING THE NUMBERS
                    int temp= this.array[j];
                    this.array[j]= this.array[j+1];
                    this.array[j+1]=temp;
                }
            }
        }
        return this.array;
    }
    // THIS IS SORT I HAVE DONE USING RECURSION
    public int[] mySort(int[] myArray){
        boolean is_swapped= false;
        for(int j=0; j<= this.length-2; j++){
            if(myArray[j] < myArray[j+1]){
                // SWAPPING THE NUMBERS
                is_swapped= true;
                int temp= myArray[j];
                myArray[j]= myArray[j+1];
                myArray[j+1]=temp;
            }
        }
        if(is_swapped)
            mySort(myArray);
        return myArray;
    }
    public void print(){
        System.out.println("");
        for(int i:this.array){
            System.out.print(i+" ");
        }
    }
    
}
