class Parent{
    private int id;
    Parent(int id){
        this.id = id;
    }
    Parent(){}
    public String print(){
        // System.out.println("from Parent");
        return "from Parent";
    }
    /**
     * @return int return the id
     */
    public int getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(int id) {
        this.id = id;
    }

}
class Child extends Parent{
    private  String name;
    Child(String name){
        super();
        this.name = name;
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
    public String print(){
        System.out.println(super.getId());
        // System.out.println("from Child"+super.print());
        return "from Child";
    }
    
}
class MethodOverriding{
    public static void main(String[] arguments){
        Child obj= new Child("MyName");
        System.out.println(obj.getId());
        System.out.println(obj.print());
    }

}