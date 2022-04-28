import java.util.ArrayList;
import java.util.Arrays;

import javafx.geometry.Side;

public class ArmstrongNumber {
    public static void main(String[] args){
        System.out.println(checkArmstrong(153));
    }
    public static boolean checkArmstrong(Integer number){
        Integer num= number;
        ArrayList<Integer> arr= new ArrayList<Integer>();
        while(num > 9){
            arr.add(num%10);
            num= num/10;
        }
        arr.add(num);
        Integer power= arr.size();
        System.out.println("The List is "+ Arrays.toString(arr.toArray()));

        Integer sum= 0;
        for(int i=0;i<arr.size();i++){
            sum+=getPowered(arr.get(i),power);
        }
        System.out.println("The Powered List is "+sum);
        return sum.equals(number);
    }
    public static Integer getPowered(Integer number, Integer power){
        Integer result=number;
        for(int i=1;i<power;i++){
            result = result * number;
        }
        return result;
    }
}
