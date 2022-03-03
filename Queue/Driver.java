class Driver{
    public static void main(String[] args){
       

        // QueueUsingList queue = new QueueUsingList();
        // queue.enqueue(2);
        // queue.enqueue(7);
        // queue.enqueue(8);
        // queue.enqueue(4);
        // System.out.println("FRONT: "+queue.getFront()+" and REAR: "+queue.getRear());
        // System.out.println("Dequeue item is : "+queue.dequeue());
        // System.out.println("FRONT: "+queue.getFront()+" and REAR: "+queue.getRear());

        LinearQueue lq= new LinearQueue(4);
        System.out.println("Is empty :"+lq.isEmpty());
        System.out.println("Is Full :"+lq.isFull());

        lq.enqueue(1);
        lq.enqueue(2);
        lq.enqueue(3);
        lq.enqueue(4);
        lq.enqueue(5);
        
        lq.dequeue();
        lq.enqueue(5);
        System.out.println("\n-------------CIRCULAR QUEUE-----------");

        CircularQueue cq= new CircularQueue(4);
        cq.enqueue(1);
        cq.enqueue(2);
        cq.enqueue(3);
        cq.enqueue(4);
        cq.enqueue(5);
        cq.dequeue();
        cq.enqueue(5);

     
    }
}