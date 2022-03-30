import java.util.ArrayList;
import java.util.Collections;

public class BucketSort {
    int[] array;
    int length;
    BucketSort(int[] integers){
        this.array= integers;
        this.length= integers.length;
    }
    public void print(){
        System.out.println("");
        for(int i:this.array){
            System.out.print(i+" ");
        }
    }
    /**
     * FIRST CALCULATE THE BUCKETS REQUIRED
     * FIND THE MAXIMUM VALUE IN THE ARRAY
     * DISTRIBUTE ELEMENTS IN THE BUCKETS
     * SORT EVERY BUCKETS
     * MERGE ALL THE BUCKETS
    */
    public void sort(){
        int numberOfBuckets= (int) Math.ceil(Math.sqrt(this.length));
        System.out.println(numberOfBuckets+" buckets required");
        int maxValue= Integer.MIN_VALUE;
        for(Integer i: this.array){
            if(i>maxValue)
                maxValue=i;
        }
        ArrayList<Integer>[] buckets = new ArrayList[numberOfBuckets];
        for (int i=0; i<buckets.length; i++) {
            buckets[i] = new ArrayList<Integer>();
        }
        for (int value: this.array) {
            int bucketNumber = (int) Math.ceil(((float)value * numberOfBuckets)/(float)maxValue);
            System.out.println("Value :"+value+", bucket no:"+bucketNumber+", max value: "+maxValue);
            buckets[bucketNumber-1].add(value);
        }
        for(ArrayList<Integer> bucket: buckets){
            Collections.sort(bucket);
        }
        int index= 0;
        for(ArrayList<Integer> bucket: buckets){
            for(int i: bucket){
                this.array[index]= i;
                index++;
            }
        }

    }







}
