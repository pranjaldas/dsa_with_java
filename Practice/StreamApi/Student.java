class Student{
    private String name;
    private long salary;
    private long age;
    public Student(String name, long salary){
        this.name=name;
        this.salary=salary;
    }
    public Student(String name, long salary, long age){
        this.name=name;
        this.salary=salary;
        this.age= age;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public long getSalary() {
        return salary;
    }
    public void setSalary(long salary) {
        this.salary = salary;
    }
    public long getAge() {
        return age;
    }
    @Override
    public String toString() {
        return "Student [name=" + name + ", salary=" + salary + "]";
    }
    
}