/**
 * FIND THE CONTINOUS SUB ARRAYS WITH THE GIVEN SUM INSIDE AN ARRAY
 */
class FindSubArrayWithSum{
    public static void main(String args[]){
        findSubArray(new int[] {1,2,3,4,5,8,10},23);
        findSubArraySumZero(new int[] {-1,2,-1,3,4,5,8,10});
    }
    public static void findSubArray(int[] array, int sum){
        for(int i= 0; i< array.length-1; i++){
            int calculatedSum=array[i];
            for(int j =i+1; j<array.length;j++){
                calculatedSum +=array[j];
                // System.out.println("i value :"+array[i]+" and j value:"+array[j]+", sum: "+calculatedSum);
                if(calculatedSum == sum){
                    System.out.println("Sub array found, from index: "+i+"..."+j);
                    return;
                }else if(calculatedSum > sum){
                    j++;
                    break;
                }else{
                    continue;
                }
            }
        }
        System.out.println("Sub array not found");

    }
    public static void findSubArraySumZero(int[] array){
        int sum= 0;
        for(int i= 0; i< array.length-1; i++){
            int calculatedSum=array[i];
            for(int j =i+1; j<array.length;j++){
                calculatedSum +=array[j];
                System.out.println("i value :"+array[i]+" and j value:"+array[j]+", sum: "+calculatedSum);
                if(calculatedSum == sum){
                    System.out.println("Sub array found, from index: "+i+"..."+j);
                    return;
                }
            }
        }
        System.out.println("Sub array not found");

    }
}