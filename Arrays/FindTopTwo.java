/**
 * WAP TO FIND TOP TWO ELEMENTS FROM AN ARRAY OF INTEGERS
 * TOP TWO MEANS IF AN ARRAY IS {2,5,1,3,9,6}, THEN 
 * THE TOP TWO WOULD BE 9 AND 6
 */
public class FindTopTwo {
    
    public static void main(String[] args){
        Integer[] array= {2,5,1,3,9,6,78,45,32,-1};
        findTopTwo(array);
    }

    public static void findTopTwo(Integer[] array){
        Integer top1= array[0];
        Integer top2= array[1];
        for(int i=1; i< array.length; i++){
            if(array[i]>= top1){
                top1= array[i];
            }
            if(array[i]> top2 && array[i]<top1){
                top2=array[i];
            }
        }
        System.out.println(String.format("%d and %d",top1,top2));


    }
    
}
