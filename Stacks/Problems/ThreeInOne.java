class ThreeInOne{
    // Three Stacks in one array
    private int noOfStacks=3;
    private int capacityOfEachStack;
    private int[] stack;
    private int[] sizesOfStacks;

    // Constructor
    public ThreeInOne(int desiredSizeOfEachStack){
        this.capacityOfEachStack=desiredSizeOfEachStack;
        this.stack=new int[desiredSizeOfEachStack * noOfStacks];
        this.sizesOfStacks= new int[noOfStacks];

    }
    public int getTopIndex(int whichStack){
        return (whichStack * this.capacityOfEachStack) + this.sizesOfStacks[whichStack];
    }

    public boolean isFull(int whichStack){
        if(sizesOfStacks[whichStack] == capacityOfEachStack)
            return true;
        else
            return false;

    }

    public boolean isEmpty(int whichStack){
        if(sizesOfStacks[whichStack] == 0)
            return true;
        else
            return false;
    }
    public int pop(int whichStack){
        int value=-1;
        if(isEmpty(whichStack)){
            System.out.println("STACK UNDERFLOW");
        }else{
            value = this.stack[getTopIndex(whichStack)-1];
            this.stack[getTopIndex(whichStack)-1] = 0;
            int size=this.sizesOfStacks[whichStack] ;
            this.sizesOfStacks[whichStack] = size-1;
        }
        return value;
    }

    public void push(int whichStack, int value){
        if(this.isFull(whichStack)){
            System.out.println(whichStack+" STACK OVERFLOW!");
        }else{
            this.stack[getTopIndex(whichStack)]= value;
            int size=this.sizesOfStacks[whichStack] + 1;
            this.sizesOfStacks[whichStack] = size;
            
        }
    }
    public void print(){
        int index=0;
        while(index < this.stack.length){
            System.out.print(this.stack[index]+" ->");
            index++;
        }
    }





}