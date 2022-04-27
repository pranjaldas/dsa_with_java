class DeepShallowCopy{
    public static void main(String[] args){
        // SHALLOW COPY EXAMPLE, WHERE WE ONLY CREATE A NEW REFERECE AND POINT THE NEW REF TO THE OLD REF
        // BOTH THE OBJECT REF POINTS TO THE SAME OBJECT SO CHANGING ONE OBJECT EFFECTS THE OTHER ONE
        Student s1= new Student("Pranjal",123);
        Student s2= s1;
        System.out.println(s1.toString());
        s1.setCgpa(12);
        System.out.println(s2.toString());

        // DEEP COPY EXAMPLE, WHERE WE CREATE COMPLETE NEW OBJECT AND COPY THE OLD OBJECT ATTRIBUTES
        // TO THE NEW OBJECT MANUALLY, CANGING IN THE OLD OBJECT DOES NOT EFFECT THE NEW OBJECT 
        Student s3= new Student(s1.getName(),s1.getCgpa());
        System.out.println(s3.toString());
        s3.setCgpa(189);
        System.out.println(s1.toString());

    }
}
class Student {
    private String name;
    private Integer cgpa;

    Student() {
    }

    Student(String name, Integer cgpa) {
        this.name = name;
        this.cgpa = cgpa;
    }

    public Integer getCgpa() {
        return cgpa;
    }
    public void setCgpa(Integer cgpa){
        this.cgpa= cgpa;
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
