import java.util.*;
import java.util.stream.Collectors;

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
        System.out.println("---------SORT HASHMAP BASED ON VALUE-------");
        Map<String,Integer> map= new HashMap<>();
        map.put("jbjk",5);
        map.put("Cvsdv",4);
        map.put("Avsdv",1);
        map.put("ABC",2);
        map.forEach((k,v)->{
            System.out.println("key: "+k+" value: "+v);
        });
        LinkedHashMap<String,Integer> sortedMap= map.entrySet().stream().sorted((i,j)->{
            if(i.getValue()> j.getValue())
                return 1;
            else
                return -1;
        }).collect(Collectors.toMap(
                Map.Entry::getKey,
                Map.Entry::getValue,
                (e1, e2) -> e1, LinkedHashMap::new));
        System.out.println("---------SORT HASHMAP BASED ON VALUE-------");
        sortedMap.forEach((k,v)->{
            System.out.println("key: "+k+" value: "+v);
        });
    }
}
