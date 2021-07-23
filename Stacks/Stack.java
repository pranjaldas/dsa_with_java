class Stack{
    int[] arr;
    int topIndex;

    //Default constructor to create default object
    public Stack(){}
    public Stack(int sizeofStack) {
        arr = new int[sizeofStack];
        topIndex = -1;
    }
    public int peek(){
        if(topIndex==-1){
            System.out.println("Stack Underflow");
            return -1; 
        }else{
            return arr[topIndex];
        }
        
    }
    public void push(int item){
        if(this.isFull()){
            System.out.println("Stack Overflow");
        }else{
            topIndex++;
            arr[topIndex] = item;
        }
    }
    public boolean isEmpty(){
        if(arr==null)
            return true;
        else
            return false;
    }
    public boolean isFull(){
        if(arr[arr.length-1]==0)
            return false;
        else
            return true;
    }
    public int pop(){
        if(this.isEmpty() || topIndex == -1){
            System.out.println("Stack Underflow");
            return -1;
        }else{
            // Assigning the top value with the default integer value
            int top=arr[topIndex];
            arr[topIndex]=0;
            topIndex--;
            return top;

        }
    }
}