import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayListTest {
    public static void main(String[] args){
        List<String> arrayList = new ArrayList<>();
        arrayList.add("PRANJAL");
        arrayList.add("GOA");
        arrayList.add("MANALI");
        System.out.println(arrayList.get(1));
        Iterator itr= arrayList.iterator();
        while (itr.hasNext())
            System.out.println(itr.next());

    }
}
