import java.io.*;
import java.util.Arrays;
class Driver{
    public static void main(String[] args){
        File file= new File("files/data.txt");
        if(file.exists()){
            System.out.println("-------------FILE DETAILS-----------");
            System.out.println("THE FILE EXISTS ");
            System.out.println("Absolute path   : "+ file.getAbsolutePath());
            // NOTE getAbsoluteFile() returns a file, where getAbsolutePath() 
            // returns a file path in String format
            System.out.println("Absolute file   : "+ file.getAbsoluteFile());
            System.out.println("File name       : "+ file.getName());
            System.out.println("Can read        : "+ file.canRead());
            System.out.println("Can write       : "+ file.canRead());
            System.out.println("Is directory    : "+ file.isDirectory());
            System.out.println("Is file         : "+ file.isFile());
            System.out.println("Get parent      : "+ file.getParent());
            // file.delete();
            // File newFile= file.getAbsoluteFile();
            // System.out.println(newFile.getName());

        }else{
            System.out.println("file not exists");
            try{
                if(file.createNewFile()){
                    System.out.println("File created succesfully");
                }
            }catch(IOException e){
                e.printStackTrace();
            }
           
        }
        File file1= new File("files");
        new File("files/mydir").mkdir();
        String[] files= file1.list();
        System.out.println("Listing out the files");
        Arrays.asList(files).forEach(i->System.out.println(i));
            
    }
}