import java.util.Arrays;
public class Interview {
    public static void main(String[] args){
        int[] array= {2,3,8,4,6};
        Arrays.sort(array);
        System.out.println(Arrays.toString(array));
        System.out.print(searchInternal(array, 0, array.length-1, 2));

    }
    public static int searchInternal(int[] array,int start,int end, int givenValue){
        int middle= (start+end)/2;
        System.out.println("The middle:"+middle+" start: "+start+" end:"+end);
        //THIS CONDITION FOR END CONDITION
        if(end >= start){
            if(array[middle]==givenValue)
                return middle;
            else if( givenValue > array[middle])
                return searchInternal(array, middle+1, end, givenValue);
            else if(givenValue < array[middle])
                return searchInternal(array, start, middle, givenValue);
        }
        return -1;
        
       
    }
}
