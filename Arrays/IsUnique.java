// CHECK IF AN ARRAY HAS UNIQUE ELEMENTS 
public class IsUnique {
    public static void main(String[] args) throws Exception {
        int myArray[]= {1,3,5,7,2,8};
        System.out.println("The array is unique!: "+isUnique(myArray));
    }
    public static boolean isUnique(int[] array) {
        int lastElement = -1;
        for (int i = 0; i < array.length; i++) {
            for(int j=i+1;j<array.length;j++){
                if(array[j] == lastElement) {
                    return false;
                }
            }
            lastElement = array[i];
        }
        return true;
    }
}
