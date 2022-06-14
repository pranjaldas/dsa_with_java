import java.io.IOException;

/*
 * Exception propagation example
 * unchacked exceptions can be propagate without using throws keyword
 * for checked exceptions it is mandatory to use throws keyword with methods to propagate the exception
 * 
 */
public class Driver {
    public static void main(String[] args){
      
        try {
            unchacked2();
        } catch (Exception e) {
            //TODO: handle exception\
            e.printStackTrace();
        }finally{
            System.out.println("IN FINALLY");
        }
        System.out.println("END OF THE PROGRAM");
        try {
            checked2();  
        } catch (Exception e) {
            //TODO: handle exception
            e.printStackTrace();
        }
        
       
    }
    public static int unchacked2(){
        return unchacked1();
    }
    public static int unchacked1(){
        //IT WILL THROW A UNCHECKET EXCEPTION ARITHMATIC EXCEPTION
        return 4/0;
    }
    public static void checked1() throws IOException{
        //IOException is a checked exception
        throw new IOException("File not found");
    }
    public static void checked2() throws IOException{
        checked1();
    }
}
