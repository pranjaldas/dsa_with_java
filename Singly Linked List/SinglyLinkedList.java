class SinglyLinkedList{
    public Node head;
    public Node tail;
    public int size;

    public void createList(int value){
        head = new Node();
        Node firstNode= new Node();
        firstNode.value=value;
        firstNode.next=null;
        head= firstNode;
        tail = firstNode;
        size =1;
    }
    public void insertNodeInBegining(int value){
        if(head==null){
            System.out.println("No Linked List is created,Going to create One");
            createList(value);
        }else{
            Node tempNode= new Node();
            tempNode.value=value;
            tempNode.next=head;
            head= tempNode;
            size ++;
        }
    }
    public void insertNodeInEnd(int value){
        if(head==null){
            System.out.println("No Linked List is created,Going to create One");
            createList(value);
        }else{
            Node tempNode= new Node();
            tempNode.value=value;
            tempNode.next=null;
            tail.next = tempNode;
            tail= tempNode;
            size ++;
        }
    }
    public void insertNodeInLocation(int value,int location){
        if(head==null){
            System.out.println("No Linked List is created,Going to create One");
            createList(value);
        }else if(location > size || location<1){
            System.out.println("location can not be larger then the size");
        }else{
            Node tempNode= head;
            for(int i=1;i<location-1;i++){
                tempNode= tempNode.next; 
            }
            Node newNode=new Node();
            newNode.value=value;
            newNode.next=tempNode.next;
            tempNode.next=newNode;
            size++;
        }

    }
    public void printList(){
        Node tempNode= head;
        for(int i=1;i<=size;i++){
            
            if(i!=size){
                System.out.print(tempNode.value+" -> ");
                tempNode= tempNode.next;
            }else{
                System.out.print(tempNode.value);
            }
            
        }
    }
    public boolean searchValue(int value){
        if(head!=null){
            Node tempNode= head;
            for(int i=1;i<=size;i++){
                if(tempNode.value==value){
                    System.out.println("Item "+value +" Found in location :"+i);
                    return true;
                }else{
                    tempNode= tempNode.next;
                }
            }
            System.out.println("Item not found");
            return false;
        }else{
            System.out.println("Link List is empty");
            return false;
        }
        
    }

    public void deleteNode(int value,int location){
        if(head!=null){
            if(location==1){
                head= head.next;
                size--;
            }else if(location>size){
                System.out.println("Location could not be larger then size of the lInked List");
            }
            else if(location==size){
                // DELETING THE LAST NODE
                Node tempNode= head;
                for(int i=1;i<size-1;i++){
                   tempNode= tempNode.next;
                }
                tail= tempNode;
                tempNode.next=null;
                size--;
   
            }else{
                Node prevNode= head;
                for(int i=2;i<location;i++){
                   prevNode= prevNode.next;
                }
                prevNode.next=prevNode.next.next;
                size--;
               
           
            }
        }else{
            System.out.println("Link List is empty");

        }

    }
}