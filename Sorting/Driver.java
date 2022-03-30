public class Driver {
    public static void main(String args[]){
        // BubbleSort mBubbleSort = new BubbleSort(new int[] {6,10,3,4,9,1,5,8});
        // mBubbleSort.print();
        // mBubbleSort.sort();
        // //mBubbleSort.mySort(mBubbleSort.array);
        // mBubbleSort.print();


        // SelectionSort mBubbleSort = new SelectionSort(new int[] {6,10,3,4,9,1,5,8});
        // mBubbleSort.print();
        // mBubbleSort.sort();
        // mBubbleSort.print();

        // HeapSort hSort= new HeapSort(new Integer[] {6,10,3,4,9,1,5,8});
        // hSort.sort();
        // hSort.print();

        // InsertionSort iSort= new InsertionSort(new Integer[] {6,10,3,4,9,1,5,8});
        // iSort.sort();
        // iSort.print();

        // BucketSort bSort= new BucketSort(new int[] {6,10,3,4,9,1,5,8});
        // bSort.sort();
        // bSort.print();

        int[] array= {6,10,3,4,9,1,5,8};
        MergeSort.sort(array,0,array.length-1);
        MergeSort.printArray(array);
        

    }
}
