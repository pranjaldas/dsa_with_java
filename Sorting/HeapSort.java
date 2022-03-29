public class HeapSort {
    Integer[] array;
    Integer length;
    HeapSort(Integer[] array){
        this.array = array;
        this.length = array.length;

    }
    /**
     * STEP 1: INSERT INTO A HEAP MAX HEAP OR MIN HEAP ACCORDING TO SORTING ORDER
     * SREP 2: EXTRACT THE ELEMENTS AND STORE INTO AN ARRAY
     * THE ARRAY WILL BE SORTED ACCORDINGNLY
     */
    public void sort(){
        BinaryHeap bHeap = new BinaryHeap(this.length, "MIN");
        for(Integer i:this.array){
            bHeap.insert(i);
        }
        for(Integer i=0;i< this.length;i++){
            Integer extracted=bHeap.extractFromBinaryHeap();
            System.out.println("Extracted "+extracted);
            this.array[i] = extracted;
        }
    }
    public void print(){
        System.out.println("");
        for(Integer i:this.array){
            System.out.print(i+" ");
        }
    }
    
    
}
