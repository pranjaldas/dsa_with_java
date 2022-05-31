import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Iterator;

public class ArrayQueueTest {
    public static void main(String[] args){
        Deque<String> queue=new ArrayDeque<>();
        queue.add("Hii");
        queue.add("Hello");
        queue.add("Hola");
        queue.add("Namaskar");
        queue.addFirst("First");
        queue.addLast("Last");
        Iterator iterator=queue.iterator();
        while (iterator.hasNext())
            System.out.println(iterator.next());
        queue.pollFirst();
        queue.removeFirst();
        queue.removeLast();
        System.out.println("AFTER POLLING FIRST");
        iterator= queue.iterator();
        while (iterator.hasNext())
            System.out.println(iterator.next());

    }
}
