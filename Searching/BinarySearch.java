
public class BinarySearch {
    // IN BINARY SEARCH DATA NEED TO BE IN SORTED ORDER
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
}
