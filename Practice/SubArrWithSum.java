public final class SubArrWithSum {
    public static void main(String[] args) {
        int[] arr={2,4,5,8,10};
        findSubArray(arr, 9);
    }
    public static void findSubArray(int[] array,int sum){
        for(int i=0;i<array.length;i++){
            for(int j=i+1;j<= array.length-1;j++){
                if(array[i]+array[j]==sum){
                    System.out.println("{"+array[i]+", "+array[j]+"}");
                }
            }
        }
    }
}
