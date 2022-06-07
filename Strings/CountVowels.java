/**
 * COUNT THE NUMBER OF VOWELS AND CONSTANTS IN A STRING
 */
public class CountVowels {
    public static void main(String[] args){
        countVowels("pranjaldas");
    }
    public static void countVowels(String str){
        int i=0;
        int consonent=0;
        int vowel= 0;
        while(i<str.length()){
            if((Character.toLowerCase(str.charAt(i))=='a')
                || (Character.toLowerCase(str.charAt(i))=='e')
                || (Character.toLowerCase(str.charAt(i))=='i')
                || (Character.toLowerCase(str.charAt(i))=='o')
                || (Character.toLowerCase(str.charAt(i))=='u')){
                    vowel++;
            }else{
                consonent++;
            }
            i++;
        }
        System.out.println(String.format("No of vowels: %d and consonents: %d", vowel,consonent));

    }

}
