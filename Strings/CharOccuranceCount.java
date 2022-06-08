/**
 * FIND THE OCCURANCE OF A GIVEN CHARACTER IN A STRING
 */
class CharOccuranceCount{
    public static void main(String args[]){
        String str= "pranjaldas";
        findCount(str,'a');
    } 
    public static void findCount(String str, char givenChar){
        int count= 0;
        for(int i= 0;i< str.length();i++){
            if(str.charAt(i) == givenChar){
                count++;
            }
        }
        System.out.println(String.format("The occurence of is : %d",count));
    }
}