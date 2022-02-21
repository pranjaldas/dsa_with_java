public class Driver {
    public static void main(String[] args) throws Exception {
        MyArray myArray = new MyArray(5);
        myArray.insert(0,2);
        myArray.insert(1,3);
        myArray.insert(2,4);

        myArray.traverse();
        System.out.println("\n");
        myArray.search(4);
        myArray.search(2);

    }
}
