import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetTest {
    /**
     * NO DUPLICATE ELEMENTS ARE ALLOWED HERE
     * MAINTAINS THE ORDER BASED ON THE HASHCODE GENERATED
     */
    public static void main(String[] args){
        Set<String> hashset= new HashSet<>();
        hashset.add("Hii");
        hashset.add("Hello");
        hashset.add("Hello");
        hashset.add("Hola Madrid");
        hashset.add(null);
        hashset.forEach(c->System.out.println(c));

        Set<Student> studentSet = new HashSet<Student>();
        Student s1= new Student("Pranjal", 12);
        Student s2= new Student("Munu", 11);
        Student s3= new Student("Bhrigu", 14);
        studentSet.add(s1);
        studentSet.add(s2);
        studentSet.add(s3);
        // below will be ignored because of duplicate
        studentSet.add(s3);
        // below add will not ignored because although the contents are same but it is a new object created
        studentSet.add(new Student("Bhrigu", 14));
        studentSet.forEach(c->System.out.println(c.getName()+" code:"+c.hashCode()));

    }
}
