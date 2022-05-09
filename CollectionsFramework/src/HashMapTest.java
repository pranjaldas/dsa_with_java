import java.util.*;

/**
 * ONE NULL KEY AND MULTIPLE NULL VALUE
 * */
public class HashMapTest {
    public static void main(String[] args){
        Map<Integer,String > hmap= new HashMap<>();
        hmap.put(116,"Pranjal");
        hmap.put(null,"int");
        hmap.put(null,"hola");
        hmap.put(46,null);
        hmap.put(5,null);
        hmap.put(28,"Vinod");
        hmap.put(30,"hii");
        System.out.println(hmap.put(1,"new value"));
        hmap.forEach((key,value)->{
            System.out.println("key: "+key+" value: "+value);
        });
        System.out.println("---------new iteration-------");
        Set<Integer> keys= hmap.keySet();
        Iterator iterator= keys.iterator();
        while(iterator.hasNext())
            System.out.println(hmap.get(iterator.next()));
    }
}
