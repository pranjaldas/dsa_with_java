/*
 * REVERSE WORDS IN A STRING WITHOUT USING LIBRARY METHODS
 */
public class ReverseWordsOfSantance {
    public static void main(String[] args){
        String sentence= "My name is Pranjal Das";
        reverseSentence(sentence);

    }
    public static String reverseSentence(String sentence){
        char[] charArray= sentence.toCharArray();
        int lastIndex= charArray.length-1;
        int end,count;
        count= 0;
        end=0;
        System.out.println(lastIndex);
        for(int i=0; i<charArray.length; i++){
            if(charArray[i]==' '){
                System.out.println(String.format("Start :%d, End : %d, count: %d, i : %d",(end+1)-count, end,count,i ));
                charArray= reverseWord(charArray, (end+1)-count, end);
                count=0;
            }else if(i== lastIndex){
                end=i;
                charArray= reverseWord(charArray, end-count, end);
            }
            else{
                end=i;
                count++;
            }

        }
        // System.out.println(new String(charArray));

        return null;
    }
    public static char[] reverseWord(char[] charArray,int start,int end){
        int middle= (start+end)/2;
        int j= end;
        for(int i=start; i< middle+1;i++){
            char temp= charArray[i];
            charArray[i]= charArray[j];
            charArray[j]=temp;
            j--;
        }
        System.out.println(new String(charArray));
        return charArray;
    }
    
}
