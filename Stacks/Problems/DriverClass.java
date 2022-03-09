class DriverClass{
    public static void main(String[] args){
        // ThreeInOne threeInOne= new ThreeInOne(5);
        // System.out.println(threeInOne.getTopIndex(1));
        // threeInOne.push(1,23);
        // threeInOne.push(1,2);
        // threeInOne.push(1,16);
        // threeInOne.push(1,2);
        // System.out.println("Popped item is: "+threeInOne.pop(1));
        // threeInOne.print();

        // MIN STACK
        StackMin stack = new StackMin();
        stack.push(8);
        stack.push(3);
        stack.push(6);
        stack.push(5);
        stack.push(2);
        stack.push(7);
        stack.printStack();
        System.out.println("The min is:"+stack.getMin().value);
        stack.pop();
        System.out.println("The min is:"+stack.getMin().value);
        stack.pop();
        System.out.println("The min is:"+stack.getMin().value);
        stack.pop();
        System.out.println("The min is:"+stack.getMin().value);
        stack.printStack();
    }
}