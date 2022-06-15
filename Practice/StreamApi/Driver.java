import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.Optional;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Arrays;
import java.util.Set;
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



        // --------------------------
        // INCREASE SALARY by 10% OF ALL EMPLOYEES WHOSE SALARY GREATER THAN 1000

        List<Student> finalLsit=studentsListnew.stream().filter(i-> i.getSalary()>2800)
                                .map(s->new Student(s.getName(),((long)s.getSalary()*10/100)+s.getSalary(),s.getAge()))
                                .collect(Collectors.toList());
        List<Student> sortStudents= studentsListnew.stream()
                                .map(s->{
                                    if(s.getSalary()> 2500)
                                       s.setSalary(((long) s.getSalary()* 10/100)+s.getSalary());
                                    return s;
                                }).collect(Collectors.toList());
        System.out.println("Final list of students after increment"+ sortStudents);


        System.out.println("------------------FIND DUPLICATE ELEMENTS IN AN LIST USING STREAM------------------------");
        List<Integer> intList= new ArrayList<>();
        intList.add(5);
        intList.add(6);    
        intList.add(5);
        intList.add(6);
        intList.add(2);
        intList.add(1);
        intList.add(10);
        intList.add(9);    
        Set<Integer> mySet= new HashSet<>();
        // here we took advantage of add() method of set which returns true if added else false.
        
        intList.stream().filter((e)->!mySet.add(e))
                        .collect(Collectors.toSet())
                        .forEach((e)->System.out.println(e));

    
        System.out.println("------------------COUNT THE REPETATION OF EVERY WORDS IN A SENTANCE---------------------------");
        String str= "My name is Pranjal Das geeks for geeks is a best best site";
        List<String> wordList= Arrays.asList(str.split(" "));
        Map<String, Long> wordCount=wordList.stream().collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
        System.out.println(wordCount);
        
        
        // -------------------------------------Collectors.groupingBy(), It is similar like groupby in sql ---------------------------------------
        System.out.println("------------------COUNT THE REPETATION OF EVERY WORDS IN A SENTANCE---------------------------");
        List<Student> studentList= new ArrayList<>();
        studentList.add(new Student("Pranjal",2300,27));
        studentList.add(new Student("Akrur",2400,24));
        studentList.add(new Student("Vinod",2400,27));
        studentList.add(new Student("Amlan",2400,24));
        studentList.add(new Student("Gitartha",2400,24));
        System.out.println(studentList.stream()
        .collect(Collectors.groupingBy(Student::getAge,Collectors.summingLong(Student::getSalary))));
        System.out.println(studentList.stream()
        .collect(Collectors.groupingBy(Student::getAge)));
        System.out.println(studentList.stream()
        .collect(Collectors.groupingBy(Student::getAge,Collectors.mapping(Student::getName, Collectors.toList()))));
        
        // -------------------------------------skip(),limit() ---------------------------------------
        System.out.println("------------------skip() and limit()---------------------------");
        List<Integer> intlist= Arrays.asList(new Integer[] {1,2,3,4,5,6,7,8});
        intList.stream()
            .limit(3)
            .forEach(i -> System.out.print(i + " "));
            System.out.println();
            intlist.stream()
            .skip(2)
            .forEach(i -> System.out.print(i + " "));
        List<Integer> numbersList = new ArrayList<>();
        numbersList.add(1);
        numbersList.add(2);
        numbersList.add(3);
        numbersList.add(4);
        numbersList.add(5);
        numbersList.add(6);
    
        // Limit - return new stream of 3 elements
        System.out.println("--------Stream elements after limiting----------");
        numbersList.stream().limit(3).forEach((a) -> {
            System.out.println(a);
        });
        







    }
}
