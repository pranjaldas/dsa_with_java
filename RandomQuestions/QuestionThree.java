// FIND THE MISSING NUMBER FROM A GIVEN INT ARRAY CONSECUTIVE VALUE WHERE NO DUPLICATE NUMBER IS THERE
class QuestionThree{

    public static int findTheMissingNumber(int[] arr){
        // SUM OF NUMBERS FROM 1 TO n is = n(n+1)/2
        int total=0;
        for(int i=0; i<arr.length; i++){
            total+=arr[i];
        }
        int n= arr.length+1;
        n= n*(n+1)/2;
        return n-total;

    }
    public static void main(String[] args){
        int arr[]={1,2,3,5,6,7,8,9,10};
        System.out.print("The missing number is: "+findTheMissingNumber(arr));

    }
}