public class SelectionSort {
    int[] array;
    int length;
    SelectionSort(int[] array){
        this.array= array;
        this.length= array.length;
    }
    public void print(){
        System.out.println("");
        for(int i:this.array){
            System.out.print(i+" ");
        }
    }
    public void sort(){
        // THIS FOR LOOP IS TO MAINTAIN THE SORTED PART OF THE ARRAY
        for(int i=0; i<this.length;i++){
            int minIndex= i;
            // THIS LOOP IS TO FIND THE MIN IN THE UNSORTED ARRAY
            for(int j=i+1;j<this.length;j++){
                if(this.array[j]<this.array[minIndex]){
                    minIndex= j;
                }

            }
            if(minIndex != i){
                // SWAPPING THE NUMBERS
                int temp= this.array[i];
                this.array[i]= this.array[minIndex];
                this.array[minIndex]=temp;
            }
        }
    }
    
    
}
