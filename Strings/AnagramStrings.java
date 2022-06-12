/*
 * CHECK IF TWO STRING IS ANAGRAM OR NOT, 
 * MEANS BOTH STARING HAS SAME CHARACTER BUT DIFFERENT ORDER
 * ANGO: SORT BOTH THE STRING AND COMPARE IF SAME.
 */
public class AnagramStrings {
    public static void main(String[] args){
        String first= "pranjal";
        String second= "npralak";
        
       System.out.println(checkAnagram(sortString(first),sortString(second))); 
    }
    public static boolean checkAnagram(String first, String second){
        char[] arrFirst= first.toCharArray();
        char[] arrSecond= second.toCharArray();
        if(arrFirst.length != arrSecond.length){
            return false;
        }
        for(int i= 0; i< arrFirst.length; i++){
            if(arrFirst[i] != arrSecond[i]){
                return false;
            }
        }
        return true;
    }
    public static String sortString(String string){
        char[] array= string.toCharArray();
        for(int i=0;i<array.length-1;i++){
            for(int j=0; j<array.length-i-1;j++){
                if(array[j+1] < array[j]){
                    //swap
                    char tmp= array[j];
                    array[j]=array[j+1];
                    array[j+1]=tmp;
                }
            }
        }
        return new String(array);
    }
}
