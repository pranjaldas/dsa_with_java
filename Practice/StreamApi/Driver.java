import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.NoSuchElementException;
public class Driver {
    public static void main(String[] args){
        List<Student> students= new ArrayList<>();
        students.add(new Student("Pranjal",1293));
        students.add(new Student("Akrur",231));
        students.add(new Student("Vinod",5638));
        students.add(new Student("Amlan",908));
        // students.forEach(i->System.out.println(i.toString()));
        Student student=students.stream()
                .max(Comparator.comparing(Student::getSalary))
                .orElseThrow(NoSuchElementException::new);
        System.out.println(student.toString());
    }
}
