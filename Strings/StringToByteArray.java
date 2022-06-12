public class StringToByteArray {
    public static void main(String[] args){
        convert("pranjal");
    }
    public static byte[] convert(String string){
        byte[] array= new byte[string.length()];
        for(int i=0;i<string.length();i++){
            array[i]=(byte) string.charAt(i);
            System.out.println(array[i]);
        }
        return array;
        
    }
    
}
