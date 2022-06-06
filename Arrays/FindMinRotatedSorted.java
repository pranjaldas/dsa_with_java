/**
 * A consecutive, sorted array is rotated at some unknown point, find the minimum element in it. 
 * Input: {5, 6, 1, 2, 3, 4}
 * Output: 1 
 * The minimum element is the only element whose previous is greater than it. 
 * If there is no previous element, then there is no rotation (the first element is minimum). We check this condition for the middle element by comparing it with (mid-1)’th and (mid+1)’th elements.
 * If the minimum element is not at the middle (neither mid nor mid + 1), then the minimum element lies in either the left half or right half. 
 * If the middle element is smaller than the last element, then the minimum element lies in the left half
 * Else minimum element lies in the right half.
 */

public class FindMinRotatedSorted {
    public static void main(String[] args){
        int[] array= {6, 7, 1, 2, 3, 4, 5};
        //{3, 4, 5, 6, 7, 1, 2};
        //{6, 7, 1, 2, 3, 4, 5};
        // HERE WE ASSUMED THAT THE ARRAY IS SORTED BY INCREASING ORDER
        findMin(array,0,array.length-1);

    }
    public static void findMin(int[] array,int first, int last){
        
        if(array[first]< array[last]){
            System.out.println("NO ROTATION DONE IN THE ARRAY");
            return;
        }
        int mid= first+last/2;
        if(array[first]==array[last]){
            System.out.println(array[first]);
            return;
        }
        //CHECK IF IT IS IN THE MIDDLE
        if(array[mid-1] > array[mid] && array[mid]+1== array[mid+1]){
            System.out.println(array[mid]);
            return;
        }
        // System.out.print(mid);
        if(array[mid] > array[last]){
            //MEANS THE VALUE IN RIGHT OF THE MIDDLE
            findMin(array, mid, last);

        }else{
            //MEANS THE VALUE IN LEFT OF THE MIDDLE
            findMin(array, first, mid);
        }

        

    }
}
