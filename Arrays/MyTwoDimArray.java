public class MyTwoDimArray {
    private int[][] myArray;
    private int row;
    private int column;
    public MyTwoDimArray(int row, int column) {
        this.myArray = new int[row][column];
        this.row = row;
        this.column = column;
        for (int i = 0; i < row; i++){
            for (int j = 0; j < column;j++){
                this.myArray[i][j] =Integer.MIN_VALUE;
            }

        }
    }
    // INSERTING IN A SPECIFIC POSITION
    public void insert(int value, int row, int column){
        try{
            if(this.myArray[row][column]== Integer.MIN_VALUE)
                this.myArray[row][column] = value;
            else
                System.out.println("Could not insert a space not empty");
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Array index out of bound");
        }
    }
    //INSERTING IN ARRAY SERIALLY WHERE THERE IS A EMPTY PLACE
    public void insert(int value){
        try{
            boolean inserted = false;
            first:
            for(int i = 0; i <this.row; i++){
                for(int j = 0; j < this.column; j++){
                    if(this.myArray[i][j]== Integer.MIN_VALUE){
                        this.myArray[i][j] = value;
                        inserted = true;
                        break first;
                    }
                }

            }
            if(inserted)
                System.out.println("Inserted");
            else
                System.out.println("Array is not empty, so not inserted");
            
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Array Index out of bound");
        }
    }
    // TRAVERSING THE ARRAY
    public void traverse(){
        for (int i = 0; i < this.row; i++){
            for (int j = 0; j < this.column;j++){
                System.out.print(this.myArray[i][j]+" ");
                if(j== this.column-1){
                    System.out.print('\n');
                }
            }

        }
    }

    // SEARCH THE ELEMENT IN THE ARRAY
    public void search(int value){
        for (int i = 0; i < this.row; i++){
            for (int j = 0; j < this.column;j++){
                if(this.myArray[i][j]==value){
                    System.out.println(String.format("%s found in position row :%s column :%s",value,i,j));
                    return;
                }
            }

        }
        System.out.println(String.format("%s not found",value));
    }

}
