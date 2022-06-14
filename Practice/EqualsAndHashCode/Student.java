public class Student {
    private String name;
    private long age;
    public Student(String name, long age){
        this.name=name;
        this.age=age;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public long getAge() {
        return age;
    }
    public void setAge(long age) {
        this.age = age;
    }
    @Override
    public String toString() {
        return "Student [name=" + name + ", age=" + age + "]";
    }
}
