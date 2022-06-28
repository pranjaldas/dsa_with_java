import java.util.Comparator;
import java.util.SortedSet;
import java.util.TreeSet;
import java.util.function.Function;

public class TreeSetTest {
    public static void main(String[] args){
        Comparator<Integer> comparator= (i1,i2)->{
            if(i1>i2)
                return -1;
            else
                return 1;
        };
        SortedSet<Integer> sortedSet= new TreeSet<>(comparator);
        sortedSet.add(34);
        sortedSet.add(23);
        sortedSet.add(10);
        sortedSet.add(28);
        sortedSet.add(5);
        sortedSet.forEach(integer -> System.out.println(integer));
        System.out.println();

    }
}

