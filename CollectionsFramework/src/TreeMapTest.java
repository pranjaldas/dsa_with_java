import java.util.Collections;
import java.util.Comparator;
import java.util.Map;
import java.util.TreeMap;

public class TreeMapTest {
    public static void main(String[] args){
        Comparator<Integer> comparator = (a1,a2)->{
            if(a1> a2)
                return -1;
            else
                return 1;
        };
        Map<Integer, Integer> tmap= new TreeMap<>(comparator);
        tmap.put(1,null);
        tmap.put(2,45);
        tmap.put(8,23);
        tmap.put(6,2);
        tmap.put(5,10);


        tmap.forEach((k,v)-> System.out.println("key: "+k+"value: "+v));
    }
}
