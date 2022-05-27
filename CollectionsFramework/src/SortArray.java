public class SortArray {
    public static void main(String[] args){
        int[] array= {5,2,4,8,3,7,1};
        int[] sorted=sort(array);
        for(Integer i: sorted){
            System.out.println(i);
        }

    }
    // BUBBLE SORT O(n^2) complexity
    public static int[] sort(int[] array){
        for(int i=0;i<array.length-1;i++){
            for(int j=i+1;j<array.length;j++){
                if(array[i]>array[j]){
                    int temp= array[i];
                    array[i]=array[j];
                    array[j]=temp;
                }
            }
        }


        return  array;
    }
}
