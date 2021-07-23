class LinkedList{
    int size;
    Node head;
    Node tail;

    public LinkedList(){

    }

    // Create lined List
    public void createLinkedList(int value){
        head= new Node(value);
        tail= head;
        size=1;
    }
    public boolean isEmpty(){
        if(head==null)
            return true;
        else
            return false;
    }
    public void insert(int value, int location){
        if(isEmpty()){
            createLinkedList(value);
        }else if(location ==1){
            // INSERTING IN THE BEGINING
            Node neNode= new Node(value);
            neNode.next=head;
            head= neNode;
            size++;
        }else if(location >= size){
            // INSERTING IN THE END
            Node newNode= new Node(value);
            tail.next=newNode;
            tail= newNode;
            size++;
        }else{
            // INSERTING IN THE MIDDLE
            int index=1;
            Node neNode= new Node(value);
            Node tempNode= head;
            while(index<location-1){
                tempNode= head.next;
                index++;
            }
            neNode.next= tempNode.next;
            tempNode.next= neNode;
            size++;
        }
    }
    public int delete(int location){
        int value;
        if(isEmpty()){
            System.out.println("The List is empty");
            return Integer.MIN_VALUE;
        }else if(location ==1){
            // DELETINGIN THE BEGINING
            value= head.value;
            head= head.next;
            size--;
            return value;
        }else if(location >= size){
            // DELETING IN THE END
            int index=1;
            Node tempNode= head;
            while(index<location-1){
                tempNode= head.next;
                index++;
            }
            value= tempNode.next.value;
            tempNode.next=null;
            tail=tempNode;
            return value;
        }else{
            // DELETING IN THE MIDDLE
            int index=1;
            Node tempNode= head;
            while(index<location-1){
                tempNode= head.next;
                index++;
            }
            value= tempNode.next.value;
            tempNode.next= tempNode.next.next;
            size--;
            return value;
        }
    }
    public void display(){
        if(isEmpty()){
            System.out.println("LIST IS EMPTY");
        }else{
            
            Node  tempNode= head;
            for(int i=1;i<= size;i++){
                if(i==size){
                    System.out.print("["+tempNode.value+"|"+tempNode.next+"]");
                }else{
                    System.out.print("["+tempNode.value+"|"+tempNode.next+"] -> ");
                }
                tempNode= tempNode.next;
            }
        }
    }
}