class DoublyLinkedList{
    private int size;
    private DoublyNode head;
    private DoublyNode tail;
    //Linked List Creation using constructor method
    public DoublyLinkedList(int value) {
        DoublyNode firstNode = new DoublyNode(value);
        this.head =firstNode;
        this.tail =firstNode;
        this.size =1;
    };
    public DoublyNode getHead() {
        return this.head;
    };
    public DoublyNode getTail() {
        return this.tail;
    };

    // Insertion in the Doubly Linked List 
    public void insert(int value,int location){
        // CHECK IF EMPTY LIST
        if(this.head == null){
            System.out.println("EMPTY LIST");
        }else if(location == 1){
            // INSERTING IN THE FIRST LOCATION
            DoublyNode newNode = new DoublyNode(value);
            newNode.setNext(this.head);
            newNode.setPrevious(null);
            head.setPrevious(newNode);
            this.head=newNode;
            this.size++;
        }else if(location >= size){
            // INSERTING IN THE LAST LOCATION
            DoublyNode newNode = new DoublyNode(value);
            newNode.setNext(null);
            this.tail.setNext(newNode);
            newNode.setPrevious(this.tail);
            this.tail = newNode;
            this.size++;
        }else{
            DoublyNode newNode = new DoublyNode(value);
            DoublyNode tempNode= this.head;
            int index=1;
            while(index < location-1){
                tempNode= tempNode.getNext();
                index++;
            };
            newNode.setPrevious(tempNode);
            newNode.setNext(tempNode.getNext());
            tempNode.setNext(newNode);
            tempNode.getNext().setPrevious(newNode);
            this.size++;
            
        }
    }

    public void traverse(){
        if(this.head == null){
            System.out.println("EMPTY LIST");
        }else{
            int index=1;
            DoublyNode tempNode= this.head;
            while(index <=this.size){
                if(this.size == index){
                    System.out.print(" ["+tempNode.getPrevious()+" | "+tempNode.getValue()+" | "+tempNode.getNext()+"] ");
                }else{
                    System.out.print(" ["+tempNode.getPrevious()+" | "+tempNode.getValue()+" | "+tempNode.getNext()+"] ->");
                };
                tempNode= tempNode.getNext();
                index++;
            };
            System.out.println("\n");
        }
    }
}