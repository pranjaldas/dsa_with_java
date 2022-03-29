public class BinaryHeap {
    // THIS SIZE VARIABLE DOES NOT MEAN ARRAY SIZE
    // IT INDICATES TO THE INDEX OF THE LAST ELEMENT
    public Integer sizeOfheap;
    public Integer[] heap;
    public String heapType;
    public static final String MAX_HEAP= "MAX";
    public static final String MIN_HEAP= "MIN";

    public BinaryHeap(Integer size, String heapType){
        this.heap = new Integer[size+1];
        this.heapType =heapType;
        this.sizeOfheap= 0;
    }
    // CHECK IF EMPTY HEAP
    public boolean isEmpty(){
        if(sizeOfheap== 0)
            return true;
        else
            return false;
    }
    // TO FIND THE PEEK ELEMENT, MEANS THE FIRST ELEMENT 
    public Integer getPeek(){
        if(isEmpty())
            return null;
        else
            return heap[1];
    }
    //TRAVERSE LEVELORDER
    public void levelOrder(){
        if(isEmpty())
            System.out.println("The Binary Heap is empty \n");
        else{
            for(int i=1; i<= sizeOfheap; i++){
                System.out.println(heap[i]+" ");
            }
        }
    }
    //HEAPITY BUTTOM TO TOP
    public void heapifyButtomToTop(int index, String heapType){
        int parent = index / 2;
        if(index <= 1){
            return;
        }else{
            if(heapType == MAX_HEAP){
                if(heap[index] > heap[parent]){
                    swap(index,parent);
                }
            }else{
                if(heap[index] < heap[parent]){
                    swap(index,parent);
                }
            }
        }
        heapifyButtomToTop(parent, heapType);
    }
    // SWAP VALUES WITH THE PARENTS WITHOUT USING TEMP VARIBLE
    // COULD USE TEMP VARIAVBLE ALSO BUT DOING IT JUST FOR FUN
    public void swap(int childIndex,int parentIndex){
        heap[childIndex] =heap[childIndex] + heap[parentIndex];
        heap[parentIndex]= heap[childIndex]-heap[parentIndex];
        heap[childIndex]=heap[childIndex]-heap[parentIndex];
    }
    public void insert(Integer value){
        if(sizeOfheap == heap.length -1){
            throw new StackOverflowError();
        }else{
            sizeOfheap++;
            heap[sizeOfheap]= value;
            heapifyButtomToTop(sizeOfheap, heapType);
            System.out.println("Inserted Succesfully \n");
        }
    }

    // HEAPIFY TOP TO BUTTOM
    public void heapifyTopToButtom(int index,String heapType){
        int leftIndex = index * 2;
        int rightIndex = index * 2 + 1;
        int childIndexTOswap = 0;

        if(sizeOfheap < leftIndex){
            // WHEN THE LEFT INDEX BECOMES MORE THEN LAST ELEMENT INDEX 
            // THAT MEANS THERE IS NO MORE ELEMENTS LEFT IN THE HEAP
            // EDGE CONDITION FOR EXIT
            return;
        }
        //  CHECK FOR IF IT IS A MAX HEAP OR MIN HEAP
        if(heapType== MAX_HEAP){
            // CHECK IF THE NODE HAS TWO OR ONE CHILD
            if(sizeOfheap == leftIndex){
                // MEANS THE NODE WITH INDEX, HAS ONLY ONE CHILD AND THAT IS LEFT
                if(heap[index] < heap[leftIndex])
                    swap(index,leftIndex);
                return;
            }else{
                // HAVE TWO CHILDS,IN THIS CASE WE CONSIDER THE CHILD BETWEEN THE LEFT AND RIGHT
                // WHICH HAS MORE VALUE AMONG THEM
                if(heap[leftIndex] > heap[rightIndex])
                    childIndexTOswap= leftIndex;
                else
                    childIndexTOswap = rightIndex;

                if(heap[index] < heap[childIndexTOswap])
                    swap(childIndexTOswap, index);
            }

        }else{
            // CHECK IF THE NODE HAS TWO OR ONE CHILD
            if(sizeOfheap == leftIndex){
                // MEANS THE NODE WITH INDEX, HAS ONLY ONE CHILD AND THAT IS LEFT
                if(heap[index] > heap[leftIndex])
                    swap(index,leftIndex);
                return;
            }else{
                // HAVE TWO CHILDS,IN THIS CASE WE CONSIDER THE CHILD BETWEEN THE LEFT AND RIGHT
                // WHICH HAS LESS VALUE AMONG THEM
                if(heap[leftIndex]< heap[rightIndex])
                    childIndexTOswap= leftIndex;
                else
                    childIndexTOswap = rightIndex;
                    
                if(heap[index] > heap[childIndexTOswap])
                    swap(childIndexTOswap, index);
            }

        }
        heapifyTopToButtom(childIndexTOswap, heapType);
    }
    // EXTRACTING (DELETING THE ROOT)
    public Integer extractFromBinaryHeap(){
        if(isEmpty()){
            return null;
        }else{
            Integer extracted = heap[1];
            heap[1]= heap[sizeOfheap];
            sizeOfheap--;
            heapifyTopToButtom(1, heapType);
            return extracted;
        }
        
    }
}
