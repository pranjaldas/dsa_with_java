/**
 * FIND THE FIRST REPEATING ELEMENT FROM THE ARRAY
 * Input:  arr[] = {10, 5, 3, 4, 3, 5, 6}
 * Output: 5 [5 is the first element that repeats]
 */
import java.util.Map;
import java.util.LinkedHashMap;
public class FirstRepeating {
    public static void main(String[] args){
        Integer[] array= {2,5,1,3,9,9,3};
        findFirstRepeating(array);
    }

    public static void findFirstRepeating(Integer[] array){
        // Here I have used LinkedHashMap over HashMap because it maintains the order 
        // in which elements are inserted, so it would be helpful to find the 
       Map<Integer,Integer> map = new LinkedHashMap<>();
       for(int i= 0; i<array.length; i++){
           if(map.containsKey(array[i])){
               map.put(array[i], map.get(array[i]) + 1);
           }else{
               map.put(array[i],1);
           }
       }
       Integer firstRepeating=0;
       for (Integer key : map.keySet()) {
         if(map.get(key)>1){
            firstRepeating= key;
            break;
         }
       }
       System.out.println("First repeating element is: "+firstRepeating);


    }
}
