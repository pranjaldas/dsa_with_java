import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 * CHECK IF A GIVEN STRING HAS VOWELS OF NOT IN JAVA
 */
public class CheckIfVowel {
    public static final Character[] vowels= {'A','E','I','O','U'};
    public static void main(String[] args){
        checkIfVowelPresent("Abjwbwwvcw");
    }
    public  static void checkIfVowelPresent(String input){
        Set<Character> vowelsSet= new HashSet<>(Arrays.asList(vowels));
        char[] letters= input.toCharArray();
        int count= 0;
        for(char letter:letters){
            if(vowelsSet.contains(letter)){
                count++;
            }
            System.out.print(letter);
        }
        System.out.println("vowels presented"+count);
    }
}
