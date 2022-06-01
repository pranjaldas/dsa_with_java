import java.util.Scanner;
import java.io.FileNotFoundException;
import java.io.File;
public class ScannerTest {
    public static void main(String[] args){
        System.out.println("Enter the number:");
        java.util.Scanner scanner= new Scanner(System.in);
        int value= scanner.nextInt();
        System.out.println("Entered value is: "+ value);
        File file= new File("files/data.txt");
        try {
            Scanner sc=new Scanner(file);
            while(sc.hasNextLine()){
                System.out.println(sc.nextLine());
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        
    }
    
}
