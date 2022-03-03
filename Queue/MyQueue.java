class MyQueue{
    int arr[];
    int front;
    int rear;
    int size;

    //Creating the Queue using constructor
    public MyQueue(int size){
        this.size= size;
        this.arr = new int[size];
        this.front = 0;
        this.rear = 0;
        System.out.println("Queue Created Successfully");
    }

    public boolean isFull(){
        if(rear== this.arr.length-1)
            return true;
        else
            return false;
        
    }

    public boolean isEmpty(){
        if(this.front==this.rear)
            return true;
        else
            return false;
    }
    public void enqueue(int value){
        if(this.isFull()){
            System.out.println("Queue is full");
        }else{
            this.arr[this.rear]= value;
            rear++;
        }

        
    }
    public int dequeue(){
        if(this.isEmpty()){
            return -1;
        }else{
            int item= this.arr[this.front];
            for(int i=0;i<this.rear-1;i++){
                this.arr[i]=this.arr[i+1];
            }
            this.rear--;
            return item;

        }
    }
    public void display()
    {
        int i;
     
        if(isEmpty()) {
            System.out.println("\nQueue is Empty\n");
            return;
        }
  
        // traverse front to rear and print elements
        for (i = this.front; i < this.rear; i++) {
            System.out.print(this.arr[i]+" <-- ");
        }
        return;
    }
    public void deleteQueue(){
        //
    }
}