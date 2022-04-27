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
