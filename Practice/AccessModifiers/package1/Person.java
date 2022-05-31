package package1;
public class Person{
    private String name;
    protected Person(String name){
        this.name= name;
    }
    

    /**
     * @return String return the name
     */
    public String getName() {
        return name;
    }
    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }
  
}