public class MergeSort {
    // NEED TO 
    public static void merge(int[] array, int left, int middle, int right){
        // DEVIDING THE ARRAY INTO TWO PARTS LEFT AND RIGHT ARRAY
        int[] leftTmpArray = new int[middle - left + 2];
        int[] rightTmpArray = new int[right - middle + 1];
        // POPULATING LEFT ARRAY
        for(int i=0;i<= middle-left;i++){
            leftTmpArray[i]= array[left+i];
        }
        // POPULATING RIGHT ARRAY
        for(int i=0;i< right-middle;i++){
            rightTmpArray[i]= array[middle+1+i];
        }
        // ASSIGNING LAST ELEMENT TO MAX INTEGER
        // BECAUSE WE ARE GOING TO COMPARE BOTH THE ARRAYS PAIRWISE
        // ONE ARRAY MIGHT HAVE ONE ELEMENT LESS THAN THE OTHER
        // THE LAST ELEMENT OF THE BIGGER ARRAY MIGHT COMPARE WITH NULL VALUE 
        // AS THE OTHER ARRAY SIZE IS ONE ELEMENT LESS SO WE ADD A EXTRA
        // ELEMENT IN BOTH THE ARRAY WITH LARGE INTEGER
        leftTmpArray[middle-left+1]= Integer.MAX_VALUE;
        rightTmpArray[right-middle]= Integer.MAX_VALUE;
        int i=0,j=0;
        for(int k=left;k<=right;k++){
            // THIS COMPARISION WORKS ONLY IF THE LEFT AND RIGHT ARRAY IS SORTED
            // EVENTUALLY WHILE MERGING THE TWO ARRAYS BOTH THE ARRAY WOULD BE SORTED
            // IN CASE OF CONFUSION: MERGE SORT IS GOING TO SEPERATE EACH ELEMENTS INDIVIDUALLY IN LEFT 
            // AND RIGHT ARRAY AND COMPARE THEM AND PLACE THEM IN RIGHT POSITION
            if(leftTmpArray[i]<rightTmpArray[j]){
                array[k]=leftTmpArray[i];
                i++;
            }else{
                array[k]= rightTmpArray[j];
                j++;
            }
        }

    }
    public static void sort(int[] array, int left, int right){
        if(right >left){
            int middle= (right+left)/2;
            sort(array,left,middle);
            sort(array, middle+1, right);
            merge(array, left, middle, right);
        }
    }
    public static void printArray(int []array) {
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i]+"  ");
		}
	}
    
}
