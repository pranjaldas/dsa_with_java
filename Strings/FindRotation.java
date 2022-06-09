import java.lang.*;
public class FindRotation{
    public static void main(String[] args){
        rotateString("ABCDAE");
        
    }
    public static String rotateString(String string1){
        // HELMLOW
        int length= string1.length();
        StringBuilder newString= new StringBuilder();
        int middle= length/2;
        for(int i=middle+1;i< string1.length();i++){
            // newString.append(string1.charAt(i));
            System.out.print(string1.charAt(i));

        }
        for(int j=0;j<= middle;j++){
            // newString.append(string1.charAt(j));
            System.out.print(string1.charAt(j));  
        }
        System.out.println(newString.toString());
        return newString.toString();

    }
    
}