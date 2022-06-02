import java.util.ArrayList;
import java.util.Comparator;
import java.util.stream.Collectors;
import java.util.Collections;
import java.util.List;
import java.util.NoSuchElementException;
public class Driver {
    public static final int SALARY_BENCH= 1000;
    public static void main(String[] args){
        List<Student> students= new ArrayList<>();
        students.add(new Student("Pranjal",1293));
        students.add(new Student("Akrur",231));
        students.add(new Student("Vinod",5638));
        students.add(new Student("Amlan",908));
        // students.forEach(i->System.out.println(i.toString()));
        Comparator<Student> comparator= (Student a, Student b)->{
            if(a.getSalary()>b.getSalary())
                return 1;
            else
                return -1;
        };
        Collections.sort(students,comparator);
        students.forEach(i->System.out.println(i.toString()));
        // -------------------------Find Max or Min using Stream------------------------
        Student student=students.stream()
                .max(Comparator.comparing(Student::getSalary))
                .orElseThrow(NoSuchElementException::new);
        System.out.println("With heighst salary: "+student.toString());

        // -------------------------Filter a list based on a given value using Stream------------------------
        List<Student> list=students.stream().filter((s)->s.getSalary()>SALARY_BENCH).collect(Collectors.toList());
        list.forEach(i->System.out.println(i.toString()));


        Student s1= new Student("Pranjal",123);
        Student s2= s1;
        Student s3= new Student("Pranjal",123);
        // System.out.println("TESTING :"+s1.hashCode());
        System.out.println(s2==s3);
        System.out.println(s2.hashCode() + " "+ s1.hashCode());



    }
}
