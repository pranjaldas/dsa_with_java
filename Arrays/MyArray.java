// CREATING ARRAY 
// INSERTING ELEMENTS IN ARRAY 
// TRAVERSING THE ARRAY 
// SEARCHING ELEMENTS IN ARRAY 
// DELETING ELEMENT IN THE ARRAY 
// REMOVING BLANK SPACE IN THE ARRAY 
public class MyArray {
    int[] array;
    public MyArray(int size) {
        array = new int[size];
        for (int i = 0; i < size; i++){
            array[i] =Integer.MIN_VALUE;
        }
    }
    // INSERTING ELEMENTS IN THE ARRAY
    public void insert(int index,int value) {
        try {
            if(this.array[index]==Integer.MIN_VALUE){
                this.array[index] =value;
                System.out.println("Array Inserted Successfully");
            }else{
                System.out.println("Array Index is not empty");
            }

        }catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Array Index Out Of Bound");
        }
    } 
    // TRAVERSING THE ARRAY ELEMENTS
    public void traverse(){
        for(int i = 0; i < this.array.length; i++){
            System.out.print(this.array[i]+" ");
        }
    }

    //SEARCHING AN ELEMENT IN THE ARRAY
    public void search(int value)throws java.lang.Exception{
        for(int i=0; i<this.array.length; i++){
            if(this.array[i]==value){
                System.out.println("Item Found");
                return;  
            }  
        }
            
    }

    // DELETING ELEMENT IN THE ARRAY
    public int delete(int value){
        return 1;
    }
}
