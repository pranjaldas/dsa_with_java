import java.util.HashMap;
import java.util.Map;
/**
 * ONE NULL KEY AND MULTIPLE NULL VALUE
 * */
public class HashMapTest {
    public static void main(String[] args){
        Map<Integer,String > hmap= new HashMap<>();
        hmap.put(1,"Pranjal");
        hmap.put(2,"Vinod");
        hmap.put(3,"hii");
        hmap.put(null,"int");
        hmap.put(null,"hola");
        hmap.put(4,null);
        hmap.put(5,null);
        System.out.println(hmap.put(1,"new value"));
        hmap.forEach((key,value)->{
            System.out.println("key: "+key+" value: "+value);
        });
    }
}
