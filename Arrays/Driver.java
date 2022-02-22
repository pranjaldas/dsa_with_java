public class Driver {
    public static void main(String[] args) throws Exception {
        // MyArray myArray = new MyArray(5);
        // myArray.insert(0,2);
        // myArray.insert(1,3);
        // myArray.insert(2,4);

        // myArray.traverse();
        // System.out.println("\n");
        // myArray.search(4);
        // myArray.search(2);

        MyTwoDimArray my2DimArray = new MyTwoDimArray(2,3);
   

        my2DimArray.insert(25,0,0);
        my2DimArray.traverse();

        my2DimArray.insert(24);
        my2DimArray.insert(23);
        my2DimArray.insert(22);
        my2DimArray.insert(21);
        my2DimArray.insert(20);

        my2DimArray.insert(19);
        my2DimArray.traverse();
        my2DimArray.search(20);
        my2DimArray.search(27);

        my2DimArray.delete(20);
        m
    }
}
