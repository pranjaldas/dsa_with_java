import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.List;

/**
 * Given an array of of size n and a number k, 
 * find all elements that appear more than n/k times?
 */
class Question27{
    public static void main(String[] args){
        Integer[] array= {2,1,3,5,1,42,9,3,0,-7,1,0,4,5,5};
        findTheArray(array, 6);

    }
    public static List<Integer> findTheArray(Integer[] array,Integer k){
        Integer rep= array.length/k;
        Map<Integer,Integer> repDetails= new HashMap<>();
        for(int i=0;i<array.length;i++){
            if(repDetails.containsKey(array[i]))
                repDetails.put(array[i],repDetails.get(array[i])+1);
            else    
                repDetails.put(array[i],1);
        }
        List<Integer> returnList= new ArrayList<>();
        for(Integer i: repDetails.keySet()){
            if(repDetails.get(i)>rep)
                returnList.add(i);
        }
        System.out.print(returnList);
        return returnList;

    }
}