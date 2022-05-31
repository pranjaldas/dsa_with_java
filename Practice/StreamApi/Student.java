class Student{
    private String name;
    private long salary;
    public Student(String name, long salary){
        this.name=name;
        this.salary=salary;
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
    @Override
    public String toString() {
        return "Student [name=" + name + ", salary=" + salary + "]";
    }
    
}