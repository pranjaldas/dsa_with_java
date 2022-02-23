// CHECK IF THE GIVEN TWO ARRAY IS PERMUTATION OR NOT
// PERMUTATION MEANS HAVING ALL THE ARRAY ELEMENTS FIRST ARRAY
// IN THE SECOND ARRAY WITH OR WITHOUT HAVING THE SAME INDEX
public class Permutation {
    public static void main(String[] args) throws Exception {
        int[] array1 = {1,2,3,4,5};
        int[] array2 = {1,3,2,7,5};
        System.out.println("Palindrome status: "+checkPermutation(array1, array2));

    }
    // BRUITE FORCE APPROACH WITH COMPLEXITY O(m*n)
    public static boolean checkPermutation(int[] array1,int[] array2){
        if(array1.length != array2.length){
            return false;
        }
        for (int i = 0; i < array1.length; i++){
            boolean result = false;
            second:
            for(int j = 0; j < array2.length; j++){
                if(array1[i] == array2[j]){
                    result = true;
                    break second;
                }
            }
            if(!result){
                return result;
            }
        }
        return true;
    }
    // IN AN EFFICIENT WAY, TO CHECK PERMUTATION WE CAN CHECK THAT BOTH THE ARRAY ELEMENST SUM
    // AND BOTH THE ARRAY ELEMENTS PRODUCT SHOULD BE SAME
    // COMPLEXITY IS O(m)+O(n)
    public static boolean checkPermutation2(int[] array1,int[] array2){
        int firstsum=0,secondsum= 0;
        int firstproduct=1,secondproduct= 1;
        for(int i=0;i<array1.length; i++){
            firstsum +=array1[i];
            firstproduct *=array1[i];
        }
        for(int j=0;j<array2.length; j++){
            secondsum +=array2[j];
            secondproduct *=array2[j];
        }
        if(firstsum == secondsum && firstproduct==secondproduct)
            return true;
        else 
            return false;
    }
}
