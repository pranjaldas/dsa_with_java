import java.util.*;
class FindDuplicateTest{
    public static void main(String[] args){
        findDuplicate("ABBabcdefF");
    }
    public static void findDuplicate(String input){
        HashMap<Character,Integer> stats= new HashMap<Character,Integer>();
        for(int i= 0;i<input.length();i++){
            Character key = Character.toUpperCase(input.charAt(i));
            if(stats.containsKey(key))
                stats.put(key,stats.get(key)+1);
            else
                stats.put(key,1);
        }  
        System.out.println(stats.toString()); 
    }
}