import java.util.HashMap;
import java.util.Map;

public class FindDuplicates {
    public static void main(String[] args){
        findDuplicatesChar("pranjaldas");
    }
    public static void findDuplicatesChar(String str){
        char[] arr= str.toCharArray();
        Map<Character,Integer> hmap= new HashMap<>();
        for(int i=0;i< arr.length;i++){
            if(hmap.containsKey(arr[i])){
                System.out.println("Duplicate found: "+arr[i] );
            }else{
                hmap.put(arr[i],1);
            }
        }
    }
    
}
