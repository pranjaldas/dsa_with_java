package abstraction;

public class Driver {
    public static void main(String[] args){
        AbsTest absTest= new PureClass();
        absTest.come();
        absTest.go();
        InterfaceTest interfaceTest= new PureClass();
        interfaceTest.come();
        PureClass inter= new PureClass();
        inter.come();

    }
}
