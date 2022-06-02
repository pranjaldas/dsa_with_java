import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Map;
import java.util.LinkedHashMap;
public class FindDuplicates {
    public static void main(String[] args){
        Integer[] array= {90,4,3,3,1,0,1,29};
        System.out.println(findDuplicates(array));
    }
    public static List<Integer> findDuplicates(Integer[] array){
        Map<Integer,Integer> map= new LinkedHashMap<>();
        for(int i=0;i<array.length;i++){
            if(map.containsKey(array[i])){
                map.put(array[i],map.get(array[i])+1);
            }else{
                map.put(array[i], 1);
            }
        }
        List<Integer> duplicates= new ArrayList<>();
        for (Integer key : map.keySet()) {
          if(map.get(key)>1){
              duplicates.add(key);
          }
        }
        return duplicates;
    }
}
