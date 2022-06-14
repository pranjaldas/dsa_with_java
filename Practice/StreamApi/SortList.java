import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.ArrayList;

public class SortList {
    public static void main(String[] args){
        List<Integer> list= new ArrayList<>();
        list.add(3);
        list.add(2);
        list.add(8);
        list.add(79);
        list.add(6);
        list.add(24);
        list.add(32);
        list.add(1);
        list.stream().forEach((element)->System.out.println(element));
        System.out.println("-----------BREAK-----------");
        list.stream().sorted((e1,e2)->e1.compareTo(e2))
        .collect(Collectors.toList())
        .forEach((element)->System.out.println(element));
        System.out.println("-----------BREAK2-----------");
        list.stream().sorted((e1,e2)->{
            if(e1>=e2)
                return 1;
            else
                return -1;
        })
        .collect(Collectors.toList())
        .forEach((element)->System.out.println(element));
        
    }
}
