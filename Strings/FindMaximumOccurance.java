/*
 * Find the character with maximum occurnce
 */
public class FindMaximumOccurance {
    public static void main(String[] args){
        findMaximumOccurance("pranjaldassssss");
    }
    public static void findMaximumOccurance(String string){
        char duplicateChar='\u0000';
        int maxOccur=0;
        int count=1;
        for(int i=0;i<string.length()-1;i++){
            for(int j=i+1; j<string.length();j++){
                if(string.charAt(i)==string.charAt(j)){
                    count++;
                }
            }
            if(count > maxOccur){
                maxOccur= count;
                duplicateChar= string.charAt(i);
            }
            count=1;
           
            
        }
        System.out.println("the char: "+ duplicateChar+" and occurance: "+maxOccur);
    }
}

