/*
 * FIND UNION OF TWO SORTED ARRAY ANSO HANDLE THE DUPLICACY IN EACH ARRAY
 */
public class FindUnionOfSorted {
    public static void main(String[] args){
        int[] arr1= {2,3,5,5,7};
        int[] arr2= {3,4,5,8,9,12};
        findUnion(arr1,arr2);
    }
    public static void findUnion(int[] arr1, int[] arr2){
        int m= arr1.length;
        int n= arr2.length;
        int i=0,j=0;
        while(i<m && j<n){
            if(arr1[i]< arr2[j]){
                System.out.print(arr1[i++] +" ");
                
            }else if(arr2[j]< arr1[i]){
                System.out.print(arr2[j++] +" ");
                
            }else{
                System.out.print(arr2[j++] +" ");
                i++;
            }
        }
        
        /* Print remaining elements of
         the larger array */
        while (i < m)
            System.out.print(arr1[i++] + " ");
        while (j < n)
            System.out.print(arr2[j++] + " ");
        
        
     
    
  
 
        
    }
}
