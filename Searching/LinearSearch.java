
public class LinearSearch {
    public static void search(int[] array, int value){
        for(int i:array){
            if(i== value){
                System.out.println(value+ " found");
                return;
            }
        }
        System.out.println("Not found");
    }
}
