public class SinglyLL {
    public Node head;
    public Node tail;
    public int size;

    // CREATING LINKED LIST
    public void createLinkedList(int value){
        head= new Node();
        tail= new Node();
        Node firstnode = new Node();
        firstnode.value=value;
        firstnode.next=null;
        head= firstnode;
        tail= firstnode;
        size=1;
    }
    // PRINT ALL ELEMENTS 
    public void printList(){
        Node temp=head;
        for(int i=1;i<=size;i++){
            if(i!=size){
                System.out.print(temp.value+" -> ");
                temp=temp.next;
            }else{
                System.out.print(temp.value);
            }
            
        }
    }
    // INSERT IN THE BEGINING
    public void insertInBeginning(int value){
        if(head==null){
            createLinkedList(value);
            return;
        }
        Node newNode= new Node();
        newNode.value= value;
        newNode.next= head;
        head= newNode;
        size++;
    }
    //INSERT IN THE END
    public void insertInEnd(int value){
        if(head==null){
            createLinkedList(value);
            return;
        }
        Node newNode= new Node();
        newNode.value= value;
        newNode.next=null;
        
        tail.next= newNode;
        tail= newNode;
        size++;
    }
    // INSERT INTO A SPECIFIC LOCATION
    public void insertInLocation(int location,int value){
        if(this.head == null){
            createLinkedList(value);
        }else if(location > this.size){
            System.out.println("Size is less");
        }else{
            Node tempNode= this.head;
            for(int i=1;i<location;i++){
                tempNode= tempNode.next;
            }
            Node newNode = new Node();
            newNode.value= value;
            newNode.next=tempNode.next;
            tempNode.next= newNode;
            this.size++;
        }
    }
    
}
