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

        // SinglyLL sll1=  new SinglyLL();
        // sll1.insertInEnd(2);
        // sll1.insertInEnd(3);
        // sll1.insertInEnd(91);
      
        

        // SinglyLL sll2=  new SinglyLL();
        // sll2.insertInEnd(4);
        // sll2.insertInEnd(3);
        // sll2.insertInEnd(9);

        // addSameNode(sll1,sll2,90);
        // addSameNode(sll1,sll2,91);

        // sll1.printList();
        // System.out.println('\n');
        // sll2.printList();
        // System.out.println('\n');

       
        // findIntersect(sll1,sll2);



        SinglyLL sll1= new SinglyLL();
        sll1.insertInEnd(2);
        sll1.insertInEnd(8);
        sll1.insertInEnd(10);
        sll1.insertInEnd(3);
        sll1.insertInEnd(7);
        sll1.insertInEnd(4);
        sll1.insertInEnd(12);
        sll1.insertInEnd(6);
        sll1.printList();
        System.out.println('\n');

        partition(7, sll1);


        
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

    // PARTITION OF LINKED LIST BASED ON A VALUE x, SUCH THAT ALL THE NODES VALUE LESS THAN
    // X COMES BEFORE ALL THE NODES GREATER THAN OR EQUAL TO X.
    static void partition(int partitionValue, SinglyLL sll1){
        if(sll1.head == null){
            System.out.println("\nThe List is empty!!!");
            return;
        }else if(sll1.size == 1){
            System.out.println("\nOnly one node in the list coud not partition");
            return;
        }else{
            // IF NODE VALUE IS GREATER THAT PARTITION VALUE, ADD THE NODE IN THE BEGINING 
            // OF THE NEW LIST ELSE ADD IT IN THE BEGINING OF THE LIST
            SinglyLL newSll = new SinglyLL();
            Node sll1Current = sll1.head;
            for(int i=1;i<= sll1.size;i++){
                if(sll1Current.value >= partitionValue){
                    newSll.insertInEnd(sll1Current.value);
                }else{
                    newSll.insertInBeginning(sll1Current.value);
                }
                sll1Current = sll1Current.next;
            }
            newSll.printList();
            
        }

    }
    

}
