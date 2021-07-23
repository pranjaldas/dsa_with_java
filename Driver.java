class Driver{
    public static void main(String[] args){
        // Stack stack = new Stack(3);
        // stack.push(1);
        // stack.push(2);
        // stack.push(3);
        // stack.push(4);
        // System.out.println(stack.peek());
        // System.out.println(stack.pop());
        // System.out.println(stack.pop()); 
        // System.out.println(stack.pop());
        // System.out.println(stack.pop());
        // System.out.println(stack.peek());

        // StackUsingLinkedList stack = new StackUsingLinkedList();

        // stack.push(3);
        // stack.push(4);
        // // System.out.println("Popped item is : "+stack.pop());
        // System.out.println("Peek item is : "+stack.peek());
        // QueueArray queue = new QueueArray(5);
        // queue.enqueue(1);
        // queue.enqueue(5);
        // queue.enqueue(1);
        // queue.enqueue(5);
  
        // queue.display();

        QueueUsingList queue = new QueueUsingList();
        queue.enqueue(2);
        queue.enqueue(7);
        queue.enqueue(8);
        queue.enqueue(4);
        System.out.println("FRONT: "+queue.getFront()+" and REAR: "+queue.getRear());
        System.out.println("Dequeue item is : "+queue.dequeue());
        System.out.println("FRONT: "+queue.getFront()+" and REAR: "+queue.getRear());
        

     
    }
}