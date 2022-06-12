/*
 * REVERSE A STRING IN PLACE IN JAVA, MEANS WITHOUT USING EXTRA SPACE
 */
public class ReverssStringInPlace {
    public static void main(String[] args){
        String string= "PRANJAL";
        // USING STRING BUILDER INBUILD CLASS
        StringBuilder stringBuilder= new StringBuilder(string);
        System.out.println(stringBuilder.reverse());
        System.out.println(reverse(string));

    }
    public static String reverse(String string){
        char[] charArray= string.toCharArray();
        int middle= charArray.length/2;
        int j= charArray.length-1;
        for(int i=0; i< middle;i++){
            char temp= charArray[i];
            charArray[i]= charArray[j];
            charArray[j]=temp;
            j--;
        }
        return new String(charArray);
    }
}
