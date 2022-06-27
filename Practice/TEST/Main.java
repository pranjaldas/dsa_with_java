public class Main {
    static Callback listener= new MyClass();
    public static void main(String[] args){
        A.listen(listener);
    }
}
