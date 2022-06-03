import java.util.ArrayList;
import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.Optional;
import java.util.function.Predicate;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Arrays;
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
        // --------------------------------Find Max or Min using Stream--------------------------------------
        Student student=students.stream()
                .max(Comparator.comparing(Student::getSalary))
                .orElseThrow(NoSuchElementException::new);
        System.out.println("With heighst salary: "+student.toString());

        // -------------------------Filter a list based on a given value using Stream------------------------
        List<Student> list=students.stream().filter((s)->s.getSalary()>SALARY_BENCH).collect(Collectors.toList());
        list.forEach(i->System.out.println(i.toString()));

        // ---------------------------------------------Map method-------------------------------------------
        List<Long> studentsList= students.stream().map(s->s.getSalary()).collect(Collectors.toList());
        System.out.println("The Student salary list"+ studentsList);
        List<Student> newList= students.stream()
                    .map(s-> new Student(s.getName(),(s.getSalary()+1000)))
                    .collect(Collectors.toList());
        System.out.println("The student updated list"+ newList);
        // ------------------------------------Reducing using reduce method----------------------------------
        String[] myArray = { "this", "is", "a", "sentence" };
        String result = Arrays.stream(myArray)
                .reduce("", (a,b) -> a +" "+ b+" ");
        System.out.println("The String is "+result);
        Long totalSalary= students.stream().map(s->s.getSalary()).reduce(0L,Long::sum);
        System.out.println("Total : "+totalSalary);

        // ---------------------------------------------Find First-------------------------------------------
        List<Integer> numbers= Arrays.asList(new Integer[]{1,2,3,4,5});
        Optional<Integer> grt= numbers.stream().filter(i-> i > 3).findFirst();
        if(grt.isPresent())
            System.out.println(grt.get());

        Map<Integer,Integer> myMap = new LinkedHashMap<>();
        myMap.put(1,1);
        myMap.put(2,2);
        myMap.put(6,1);
        myMap.put(3,3);

        Optional<Integer> opt= myMap.keySet().stream().filter(i->myMap.get(i)>1).findFirst();
        if(opt.isPresent())
            System.out.println(opt.get());

        // -----------------------------------------anyMatch() method----------------------------------------
        List<Integer> intarr= Arrays.asList(1,2,3,4,5,6);
        boolean check = intarr.stream().anyMatch(i->i%2==5);
        System.out.println(check);

        List<Student> studentsListnew= new ArrayList<>();
        studentsListnew.add(new Student("Pranjal",2800,26));
        studentsListnew.add(new Student("Amal",5000,36));
        studentsListnew.add(new Student("Utpal",1600,32));
        studentsListnew.add(new Student("Kishok",5630,25));
        Predicate<Student> salMore= e->e.getSalary() >2800;
        Predicate<Student> ageMore= e->e.getAge() >25;
        Predicate<Student> combinedCon= salMore.and(ageMore);
        boolean checkComCon= studentsListnew.stream().anyMatch(combinedCon);
        System.out.println(checkComCon);

        List<Student> studentsupdlist= studentsListnew.stream()
                                        .filter(combinedCon)
                                        .collect(Collectors.toList());
        System.out.println(studentsupdlist);








    }
}
