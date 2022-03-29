public class InsertionSort {
    Integer[] array;
    Integer length;
    InsertionSort(Integer[] array){
        this.array = array;
        this.length = array.length;

    }
    
    public void print(){
        System.out.println("");
        for(int i:this.array){
            System.out.print(i+" ");
        }
    }

    public void sort(){
        // THIS ARRAY IS TO LOOP THROUGH THE UNSORTED PART STARTING FROM THE 1 POSITION
        // BECAUSE WE NEED TO COMPARE THEN 1 ELEMENT WITH THE 0 ELEMENT IN THE ARRAY
        for(int i=1; i<this.length; i++){
            int temp=this.array[i],j=i;
            // THIS LOOP IS TO LOOP BACKWARD TILL THE BEGINNING OF THE ARRAY TO FIND THE 
            // PERFECT LOCATION OF THE ELEMENT array[j] IF THE PREV ELEMENT array[j-1] IN 
            // THE SORTED PART IS  GREATER THEN THE FIRT ELEMENT IN THE UNSORTED PART.
            while(j>0 && this.array[j-1]>temp){
                this.array[j]=this.array[j-1];
                // AFTER SWAPPING THE VALUE IN ABOVE WE HAVE DECREMENTED THE J VALUE 
                j--;
            }
            this.array[j]=temp;
        }
    }

}
