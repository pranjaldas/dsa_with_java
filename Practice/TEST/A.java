import java.util.*;
class A{
    public static void main(String[] args){
        int[] nums= {3,2,3};
        twoSum(nums,6);
    }
    public static void twoSum(int[] nums, int target) {
        int[] indices= new int[2];
        for(int i=0; i<nums.length-1;i++){
            indices[0]=i;
            boolean found= false;
            for(int j= i+1; j<nums.length;j++){
                if(nums[i]+nums[j] == target){
                    found=true;
                    System.out.println(i+" "+j);
                    indices[1]=j;
                    break;
                }
            }
            if(found)
                break;
        }
        System.out.println(Arrays.toString(indices));
    }
}