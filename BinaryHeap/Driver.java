public class Driver {
    public static void main(String args[]){
        BinaryHeap bHeap = new BinaryHeap(10, "MIN");
        bHeap.insert(10);
        bHeap.insert(12);
        bHeap.insert(8);
        bHeap.insert(25);
        bHeap.insert(9);
        bHeap.levelOrder();
        bHeap.extractFromBinaryHeap();
        bHeap.extractFromBinaryHeap();
        bHeap.levelOrder();
    }
    
}
