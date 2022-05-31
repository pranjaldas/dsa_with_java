class Student implements Cloneable {
    private String name;
    private Integer cgpa;

    Student() {
    }

    Student(String name, Integer cgpa) {
        this.name = name;
        this.cgpa = cgpa;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCgpa(Integer cgpa) {
        this.cgpa = cgpa;
    }

    protected  void sayHii(){
        System.out.println("METHOD TO TEST PROTECTED");
    }

    public Integer getCgpa() {
        return cgpa;
    }

    public String getName() {
        return name;
    }
    @Override
    public Object clone() throws CloneNotSupportedException{

        return super.clone();

    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", cgpa=" + cgpa +
                '}';
    }
}
