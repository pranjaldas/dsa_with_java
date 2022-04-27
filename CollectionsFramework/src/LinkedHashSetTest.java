import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class LinkedHashSetTest {
    /**
     * HERE ORDER IS MAINTAINED BASED ON THE ORDER ON INSERTION
     * NO DUPLICATES ALLOWED
     */
    public static void main(String[] args){
        Set<String> linkedHashSet= new LinkedHashSet<>();
        linkedHashSet.add("Hii");
        linkedHashSet.add("Hello");
        linkedHashSet.add("Hola Madrid");
        linkedHashSet.add(null);
        Iterator iterator = linkedHashSet.iterator();
        while (iterator.hasNext())
            System.out.println(iterator.next());

    }
}
