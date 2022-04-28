public class Student implements Cloneable{
    private int roll;
    private String name;
    Student(){
        // DEFAULT CONSTRUCTOR
    }
    Student(int roll,String name){
        this.roll= roll;
        this.name=name;
    }
    public int getRoll() {
        return roll;
    }
    public void setRoll(int roll) {
        this.roll = roll;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    @Override
    public String toString() {
        return "Student [name=" + name + ", roll=" + roll + "]";
    }
    @Override
    public Object clone() throws CloneNotSupportedException{
        return super.clone();
    }
}
