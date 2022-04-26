import java.util.*;

public class LinedListTest {
    public static void main(String[] args){
        List<String> arrayList = new LinkedList<>();
        arrayList.add("PRANJAL");
        arrayList.add("GOA");
        arrayList.add("MANALI");
        System.out.println(arrayList.get(1));
        Iterator itr= arrayList.iterator();
        while (itr.hasNext())
            System.out.println(itr.next());

        Deque<String> stringDeque= new LinkedList<>();
        stringDeque.add("NAME1");
        stringDeque.add("NAME10");
        stringDeque.add("NAME101");
        stringDeque.addLast("LAST");
        stringDeque.addFirst("FIRST");
        stringDeque.addAll(arrayList);
        Iterator itr1= stringDeque.iterator();
        while (itr1.hasNext())
            System.out.println(itr1.next());

    }
}
