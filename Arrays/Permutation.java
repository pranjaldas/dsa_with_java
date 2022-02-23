// CHECK IF THE GIVEN TWO ARRAY IS PERMUTATION OR NOT
// PERMUTATION MEANS HAVING ALL THE ARRAY ELEMENTS FIRST ARRAY
// IN THE SECOND ARRAY WITH OR WITHOUT HAVING THE SAME INDEX
public class Permutation {
    public static void main(String[] args) throws Exception {
        int[] array1 = {1,2,3,4,5};
        int[] array2 = {1,3,2,4,5};
        System.out.println("Palindrome status: "+checkPermutation(array1, array2));

    }
    // BRUITE FORCE APPROACH WITH COMPLEXITY O(n^2)
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
    public static boolean checkPermutation2(int[] array1,int[] array2){
        
        return false;
    }
}
