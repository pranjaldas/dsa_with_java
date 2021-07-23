class QueueArray{
    int arr[];
    int startIndex;
    int endIndex;

    //Creating the Queue using constructor
    public QueueArray(int size){
        this.arr = new int[size];
        this.startIndex = 0;
        this.endIndex = 0;
        System.out.println("Queue Created Successfully");
    }

    public boolean isFull(){
        if(endIndex== this.arr.length-1)
            return true;
        else
            return false;
        
    }

    public boolean isEmpty(){
        if(this.startIndex==this.endIndex)
            return true;
        else
            return false;
    }
    public void enqueue(int value){
        if(this.isFull()){
            System.out.println("Queue is full");
        }else{
            this.arr[this.endIndex]= value;
            endIndex++;
        }

        
    }
    public int dequeue(){
        if(this.isEmpty()){
            return -1;
        }else{
            int item= this.arr[this.startIndex];
            for(int i=0;i<this.endIndex-1;i++){
                this.arr[i]=this.arr[i+1];
            }
            this.endIndex--;
            return item;

        }
    }
    public void display()
    {
        int i;
     
        if(this.startIndex==this.endIndex) {
            System.out.println("\nQueue is Empty\n");
            return;
        }
  
        // traverse front to rear and print elements
        for (i = this.startIndex; i < this.endIndex; i++) {
            System.out.print(this.arr[i]+" <-- ");
        }
        return;
    }
    public void deleteQueue(){
        //
    }
}