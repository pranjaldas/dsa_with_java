public class Driver {
    public static void main(String[] args){
        Student s1= new Student("Pranjal", 28);
        Student s2= new Student("Pranjal", 28);
        Student s3= s1;

        System.out.println(s1.equals(s3));
        System.out.println("s1 hashcode : "+s3.hashCode()+" s2 hashcode :"+s3.hashCode());

    }
}
