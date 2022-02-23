public class Main {
    public static void main(String[] args){
        SinglyLinkedList sll= new SinglyLinkedList();
        sll.createList(4);
        sll.insertNodeInEnd(5);
        sll.insertNodeInEnd(6);
        // sll.insertNodeInLocation(8,1);
        sll.insertNodeInEnd(10);
        sll.insertNodeInEnd(9);
        sll.insertNodeInEnd(91);
        sll.printList();
        System.out.println("\n");
        // sll.searchValue(6);
        sll.deleteNode(1,3);
        sll.printList();
    }
}
