public class Main {
    public static void main(String[] args) throws Exception {
        // SinglyLL sll= new SinglyLL();
        // sll.createLinkedList(6);
        // sll.insertInBeginning(5);
        // sll.insertInEnd(7);
        // sll.printList();
        // sll.insertInLocation(2,85);
        // System.out.println("The list is: ");
        // sll.printList();

        CircularDLL cdll= new CircularDLL();
        cdll.search(7);
        cdll.createLL(5);
        cdll.insertInBegining(6);
        cdll.insertInBegining(7);
        cdll.insertInEnd(4);
        // cdll.insertInlocation(22, 2);
        // cdll.search(7);
        cdll.printList();
        cdll.printListReverse();

        cdll.delete(6);
        cdll.printList();

        
    }
}
