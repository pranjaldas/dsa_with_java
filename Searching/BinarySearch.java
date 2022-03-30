
public class BinarySearch {
    // IN BINARY SEARCH DATA NEED TO BE IN SORTED ORDER
    // My method using recursion
    public static boolean search(int[] list,int first, int last, int value){
        if(last > first){
            int middle = (first+last)/2;
            if(value== list[middle]){
                System.out.println("found");
                return true;
            }else if(value < middle){
                search(list,first, middle,value);
            }else if( value > middle){
                search(list, middle+1 ,last,value);
            }
        }
        System.out.println("not found");
        return false;
    }

    public static void search(int[] array, int value){
        int firstIndex= 0;
        int lastIndex= array.length-1;
        int middleIndex= (firstIndex+lastIndex)/2;
        while(array[middleIndex] != value && firstIndex < lastIndex){
            if(array[middleIndex] > value)
                lastIndex = middleIndex;
            else
                firstIndex= middleIndex + 1;
            middleIndex= (firstIndex+lastIndex)/2;
        }
        if(array[middleIndex] == value)
            System.out.println("found in position "+(middleIndex+1)); 
        else
            System.out.println("not found");

    }
}
