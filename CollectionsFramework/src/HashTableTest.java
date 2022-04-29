import java.util.Hashtable;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.function.BiConsumer;

/**
 * IT DOES NOT ALLOW DUPLICATE KEY
 * DO NOT ALLOW NULL KEY OR VALUE
 * */
public class HashTableTest {
    public static void main(String[] args){
        Map<Integer, String>  hashTable= new Hashtable<>();
        hashTable.put(1,"Pranjal");
        hashTable.put(3,"Pranjal");
        hashTable.put(2,"Vinod");
        hashTable.put(4,null);
        //THREE WAYS OF ITERATION, FIRST METHOD
        Iterator iterator= hashTable.entrySet().iterator();
        while (iterator.hasNext())
            System.out.println(iterator.next().toString());
        //SECOND METHOD
        hashTable.forEach((k,v)-> System.out.println("key: "+k+" value: "+v));
        //THIRD METHOD
        Set<Integer> set= hashTable.keySet();
        Iterator<Integer> iterator1=set.iterator();
        while (iterator1.hasNext()){
            System.out.println(hashTable.get(iterator1.next()));
        }

    }
}
