import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
public class BufferedWriterTest {
    public static void main(String[] args) throws IOException{
        File file= new File("files/data.txt");
        BufferedWriter writer= new BufferedWriter(new FileWriter(file));
        writer.write("JAVA 1.8 FEATURES \nJAVA IOExceptions");
        writer.close();
        

    }
}
