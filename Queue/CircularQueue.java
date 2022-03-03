public class CircularQueue {
    public int[] queue;
    public int size;
    public int frontIndex;
    public int rearIndex;

    public CircularQueue(int size){
        this.size= size;
        this.queue = new int[size];
        this.frontIndex = this.rearIndex = -1;
        System.out.println("\n Circular array is created with size : "+size);
    }

    public boolean isFull(){
        if((this.frontIndex == 0 &&  this.rearIndex== size-1) ||
        (this.rearIndex == this.frontIndex-1))
            return true;
        else
            return false;
    }
    public boolean isEmpty(){
        if(this.frontIndex == -1)
            return true;
        else
            return false;
    }
    public void enqueue(int value){
        if(isFull()){
            System.out.println("\nArray is Full!!");
            return;
        }else if(isEmpty()){
            this.frontIndex=0;
            this.rearIndex++;
            this.queue[this.rearIndex]=value;
            System.out.println("\n Element inserted in the front with value : "+value);
            return;
        }else{
            if(this.rearIndex == this.size-1 && this.frontIndex != 0){
                this.rearIndex = 0;
            }else{
                this.rearIndex ++;
            }
            this.queue[this.rearIndex]=value;
            System.out.println("\n Element inserted with value : "+value);
        }
    }

    public void dequeue(){
        if(isEmpty()){
            System.out.println("\n The array is empty");
            return;
        }else{
            int deleted= this.queue[this.frontIndex];
            if(this.frontIndex == this.rearIndex){
                this.frontIndex= this.rearIndex = -1;
            }else if(this.frontIndex == size-1){
                this.frontIndex =0;
            }else{
                this.frontIndex ++;
            }
            System.out.println("\n Thde deleted element is : "+deleted);

        }
    }
}
