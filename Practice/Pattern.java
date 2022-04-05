/**
 * Print the pattern
 *  1
 *  0   1
 *  1   0   1
 *  0   1   0   1
 *  1   0   1   0   1
 */
public class Pattern {
    public static void main(String args[]){
        int initialValue= 1;
        for(int i=1;i<=5;i++){
            int j=0;
            int printValue = initialValue;
            while(j<i){
                System.out.print(printValue+" ");
                printValue = printValue==1?0:1;
                j++;
            }

            System.out.print(" \n");
            initialValue = initialValue==1?0:1;
        }
    }
    
}
