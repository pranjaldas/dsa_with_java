class QueueUsingList{
    LinkedList list;
    int front;
    int rear;

    public QueueUsingList(){
        this.list = new LinkedList();
        this.front = 0;
        this.rear = 0;
    }
    public int getFront(){
        this.front =  list.head.value;
        return this.front;
    }
    public int getRear(){
        this.rear =list.tail.value;
        return this.rear;
    }

    public void enqueue(int value){
        int location = this.list.size==0 ? 1 : this.list.size+1;
        list.insert(value,location);
  
    }
    public int dequeue(){
        int value=0;
        if(list.isEmpty()){
            System.out.println("QUEUE IS EMPTY");
            value = Integer.MIN_VALUE;
        }else{
            value= list.head.value;
            list.delete(1);
        }
        return value;
    }
}