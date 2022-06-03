import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.File;
import java.io.FileNotFoundException;
public class BufferedReaderTest {
    public static void main(String[] args) throws FileNotFoundException, IOException {
        File file= new File("files/data.txt");
        BufferedReader reader= new BufferedReader(new FileReader(file));
        String line;
        while((line =reader.readLine()) != null) 
            System.out.println(line);

        BufferedReader breader= new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the line :");
        String input= breader.readLine();
        System.out.println(input);

    }
}
