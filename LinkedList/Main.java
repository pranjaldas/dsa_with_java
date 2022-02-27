public class Main {
    public static void main(String[] args) throws Exception {
        //SinglyLL sll= new SinglyLL();
        // sll.createLinkedList(6);
        // sll.insertInBeginning(5);
        // sll.insertInEnd(7);
        // sll.printList();
        // sll.insertInLocation(2,85);
        // System.out.println("The list is: ");
        // sll.printList();

        SinglyLL sll1=  new SinglyLL();
        sll1.insertInEnd(2);
        sll1.insertInEnd(3);
        sll1.insertInEnd(91);
      
        

        SinglyLL sll2=  new SinglyLL();
        sll2.insertInEnd(4);
        sll2.insertInEnd(3);
        sll2.insertInEnd(9);

        addSameNode(sll1,sll2,90);
        addSameNode(sll1,sll2,91);

        sll1.printList();
        System.out.println('\n');
        sll2.printList();
        System.out.println('\n');

       
        findIntersect(sll1,sll2);


        
    }

    // CHECK IF TWO SINGLY LINKED LIST IS INTERSECTING
    // INTERSECTING MEANS THE TWO LIST INTERSECT IN A NODE WITH THE SAME REFFERENCE
    // NOT BY VALUE, IF INTERSECTING FIND THE FIRST ELEMENT OF INTERSECTION
    // 7-> 1-> 2-> 3
    //              \
    //               4-> 5-> 6
    //              /
    //     2-> 8-> 9
    static Node findTheStartNode(Node head, int kth){
        Node current= head;
        while(kth>0 && current != null){
            current= current.next;
        }
        return current;
    }
    static void findIntersect(SinglyLL list1, SinglyLL list2){
        if(list1.head == null || list1.head == null){
            System.out.println("One of them or both are empty");
            return;
        }else if(list1.tail != list2.tail){
            System.out.println("since tails ref are not same cound not be intersecting");
            return;
        }
        // WE HAVE TO CROP ONE LIST TO MAKE THEM OF SAME SIZE
        // MEANS WE HAVE TO IGNORE THE NODES FROM THE LONGER ONE WITH THE DIFFERENCE OF SIZE.
        Node  list1Node = new Node();
        Node  list2Node = new Node();
        if(list1.size > list2.size){
            // LIST 1 IS LONGER
            list2Node= list2.head;
            list1Node = list1.head;
            list1Node= findTheStartNode(list1Node,list1.size-list2.size);
        }else{
            // LIST 2 IS LONGER
            list1Node= list1.head;
            list2Node= list2.head;
            list2Node= findTheStartNode(list2Node,list1.size - list2.size);
        }
        while(list1Node != list2Node){
            list1Node= list1Node.next;
            list2Node= list2Node.next;
        }
        // SINCE WE ARE RETURNING THE INTERSECTING NODE ONLY
        // EITHER ONE NODE FROM LIST 1 OR LIST 2 IS SAME
        System.out.println("The intersecting node is: "+list1Node.value);

    }
    static void addSameNode(SinglyLL sll1,SinglyLL sll2, int value){
        Node newNode = new Node();
        newNode.value= value;
        sll1.tail.next= newNode;
        sll1.tail= newNode;
        sll1.size++;

        sll2.tail.next= newNode;
        sll2.tail= newNode;
        sll2.size++;
    }
    

}
