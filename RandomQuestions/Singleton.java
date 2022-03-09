// JAVA USES SINGLETON OBJECTS TO CREATE ONLY ONE OBJECT OF THE CLASS
// FOR EXAMPLE TO RESTRICT ONLY ONE DATABASE CONNECTION OBJECT TO CONNECT TO DB
// USE A PRIVATE CONTRUCTOR TO CREATE OBJECT
// USE A PUBLIC STATIC FUNCTION TO GET THE INSTANCE, IT IS CALLED LAZY INITIALIZATION
class Singleton{
    private static Singleton single_instance= null;
    private String value;
    private Singleton(){
        this.value= "I am singleton object";
    }
    public static Singleton getInstance(){
        if(single_instance == null)
            single_instance = new Singleton();
        return single_instance;
    }
}

    