public class Main {
    public static void main(String[] args) throws Exception {
        SinglyLL sll= new SinglyLL();
        sll.createLinkedList(6);
        sll.insertInBeginning(5);
        sll.insertInEnd(7);
        System.out.println("The list is: ");
        sll.printList();
        
    }
}
