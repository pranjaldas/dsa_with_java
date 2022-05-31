import java.util.Iterator;
import java.util.List;
import java.util.Vector;

public class VectorTest {
    public static void main(String[] args){
        List<String> vector = new Vector<String>();
        vector.add("GP");
        vector.add("NOOR");
        vector.add("DEHA");
        vector.add("MANALI");
        Iterator<String> itr= vector.iterator();

        while (itr.hasNext()){
            System.out.println(itr.next());
        }
        System.out.println();
        vector.forEach(System.out::println);
    }
}
