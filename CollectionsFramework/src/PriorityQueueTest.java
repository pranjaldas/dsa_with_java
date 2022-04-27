
import java.util.Comparator;
import java.util.Iterator;
import java.util.PriorityQueue;



public class PriorityQueueTest {
    public static void main(String[] args){
        /**
         * Comparator is functional interface, it has a compare method that we need to implement
         * here I used lambda expression instead of anonymous inner class to create comparator instance
         */
        Comparator<Student> comparator = (o1, o2) -> {
            if(o1.getCgpa()>= o2.getCgpa())
                return -1;
            else
                return 1;
        };
        PriorityQueue<Student> priorityQueue= new PriorityQueue<>(comparator);
        priorityQueue.add(new Student("Pranjal",10));
        priorityQueue.add(new Student("Vinod",8));
        priorityQueue.add(new Student("GP",9));
        priorityQueue.add(new Student("Akrur",4));
        priorityQueue.add(new Student("Amlan",6));
        Iterator iterator= priorityQueue.iterator();
        System.out.println("JUST ITERATING:");
        while (iterator.hasNext())
            System.out.println(iterator.next().toString());
        System.out.println("TESTING:");
        while(!priorityQueue.isEmpty()){
            System.out.println(" "+priorityQueue.poll());
        }
    }
}
class Student{
    private String name;
    private Integer cgpa;
    Student(){}
    Student(String name, Integer cgpa){
        this.name=name;
        this.cgpa=cgpa;
    }

    public Integer getCgpa() {
        return cgpa;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", cgpa=" + cgpa +
                '}';
    }
}