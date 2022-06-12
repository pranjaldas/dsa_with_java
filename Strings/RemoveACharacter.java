public class RemoveACharacter {
    public static void main(String[] args){
        String string= "pranjal";
        char theChar= 'j';
        removeCharacter(string,theChar);
    }
    public static String removeCharacter(String string, char theChar){
        char[] array= new char[string.length()];
        for(int i=0;i<string.length();i++){
            if(string.charAt(i) != theChar){
                array[i]= string.charAt(i);
            }
        }
        System.out.println(new String(array));
        return new String(array);
    }
}
