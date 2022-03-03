public class LinearQueue {
    public int[] queue;
    public int size;
    public int frontIndex;
    public int rearIndex;
    // LINEAR QUEUE IS NOT SO SPACE EFFICIENT AS ITEMS REMOVED FROM 
    // THE FRONT AND THE SPACE IS NEVER UTILIZED AGAIN  UNTILL AFTER CONSECUTIVE DEQUEUE,
    // THE FRONT COMES TO THE END OF THE ARRAY AND REASSIGNED FRONT TO 0TH INDEX
    // THERE MIGHT BE A SITUATION AFTER FILLING THE WHOLE QUEUE (THEN THE REAR WILL POINT 
    // LAST INDEX OF THE QUEUE) AND THEN DEQUEUE TWO ELEMENTS NEXT (FRONT WILL POINT TO 2ND 
    // INDEX OF THE QUEUE) AND THEN IF WE TRY TO ENQUEUE AN ELEMENT, WE WILL BE UNABLE TO DO SO.
    // SINCE THE REAR IS STILL POINTING TO THE LAST INDEX OF THE QUEUE IT WILL GIVE isFull()
    // VALUE AS TRUE, BUT IN PRACTICALLY THERE IS TWO EMPTY PLACES IN 0TH AND 1ST LOCATION OF THE QUEUE.
    // THIS MAKES LINEAR QUEUE LESS SPACE EFFICIENT. WE HAVE TO DEQUEUE ALL THE ELEMENTS TILL THE END OF THE 
    // QUEUE TO REINITIALIZE THE FRONT TO BEGININNING OF THE QUEUE.
    public LinearQueue(int size){
        this.size = size;
        this.queue = new int[size];
        this.rearIndex = -1;
        this.frontIndex= -1;
        System.out.println("\n Queue created with size: "+5);
    }

    public boolean isFull(){
        // SINCE IN LINEAR QUEUE WE INSERT FROM THE REAR ONLY
        // AND REAR INDEX IS POINTING TO THE LAST INDEX OF THE ARRAY
        // THEN THE QUEUE IS FULL
        if(this.rearIndex== this.size-1)
            return true;
        else
            return false;
    }
    public boolean isEmpty(){
        if(this.frontIndex == -1 || this.frontIndex == this.size)
            return true;
        else
            return false;
    }
    public void enqueue(int value){
        if(isFull()){
            System.out.println("\nThe array is full");
        }else if(isEmpty()){
            this.frontIndex = 0;
            this.rearIndex++;
            this.queue[this.rearIndex]= value;
            System.out.println("\n"+ value+ " inserted in the beginning");
        }else{
            this.rearIndex++;
            this.queue[this.rearIndex]= value;
            System.out.println("\n"+value+ " inserted");
        }
    }
    public void dequeue(){
        if(isEmpty()){
            System.out.println("\nArray is empty");
        }else{
            int deleted= this.queue[this.frontIndex];
            this.frontIndex++;
            if(this.frontIndex > this.rearIndex){
                this.frontIndex = this.rearIndex = -1;
            }
            System.out.println("\nthe deleted element is:"+deleted);

        }
    }
    
}
