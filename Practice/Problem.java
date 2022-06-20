interface A{
    int num=0;
    void hii();
    //DEFAULT METHODS WITH BODY
    default void hellow(){
        System.out.println("hellow");
    }
}
class B implements A{
    @Override
    public void hii(){

    }
}
abstract class C{
    private int num;
    protected abstract void hii();
}
class D extends C{
    @Override
    protected void hii(){

    }
}
public class Problem{
    public static void main(String[] args){
        int i=127;
        System.out.println(++i);
        System.out.println(i);
    }
}