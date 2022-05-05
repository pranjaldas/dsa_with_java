import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

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
        Student s1= new Student("Pranjal",4);
        Student s2= new Student("Akrur",5);
        ArrayList<Student> studentArrayList= new ArrayList<Student>();
        studentArrayList.add(s1);
        studentArrayList.add(s2);
        studentArrayList.add(new Student("anno",3));
        System.out.println(studentArrayList.contains(s1));
        ListIterator listIterator= studentArrayList.listIterator();
        while (listIterator.hasNext()){
            System.out.println(listIterator.next().toString());
        }
    }
}
