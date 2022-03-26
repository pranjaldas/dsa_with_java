import javafx.scene.chart.BubbleChart;

public class Driver {
    public static void main(String args[]){
        BubbleSort mBubbleSort = new BubbleSort(new int[] {6,10,3,4,9,1,5,8});
        mBubbleSort.print();
        mBubbleSort.sort();
        //mBubbleSort.mySort(mBubbleSort.array);
        mBubbleSort.print();

    }
}
