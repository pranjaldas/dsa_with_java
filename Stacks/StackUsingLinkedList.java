class StackUsingLinkedList{
    int size;
    Node head;
    Node tail;
    
    
    //CREATING A STACK LIST
    public void createStack(int value) {
        head = new Node(value);
        tail = head;
        size = 1;

    }
    public void push(int value) {
        if(this.isEmpty()){
            createStack(value);
        }else{
            Node newNode= new Node(value,head);
            head = newNode;
            size++;
        }
    }
    public boolean isEmpty() {
        if (head == null)
            return true;
        else
            return false;

    }
    public int pop(){
        if(this.isEmpty()){
            return Integer.MIN_VALUE;
        }else{
            int value= head.value;
            head= head.next;
            size--;
            return value;
            
        }
    }
    public int peek(){
        if(this.isEmpty()){
            return Integer.MIN_VALUE;
        }else{
            return head.value;
        }
    }

}