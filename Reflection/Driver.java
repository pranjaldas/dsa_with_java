import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.*;

class Driver{
    public static void main(String args[]){
        try {
            Class c= Class.forName("Test");
            Test t= (Test) c.newInstance();

            Method m= c.getDeclaredMethod("show",null);
            m.setAccessible(true);
            m.invoke(t,null);
            // System.out.println("hellow"+c.getName());

        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }catch(Exception e){
            e.printStackTrace();
        }
        
    }
}