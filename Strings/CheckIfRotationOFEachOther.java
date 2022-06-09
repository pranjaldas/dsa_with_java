/*
 * CHECK IF GIVEN TWO STRING IS ROTATION OF EACH OTHER OR NOT
 * IDEA IS MAKE A NEW STRING BY CONCATINATING FIRST STRING WITH THE FIRST STRING
 * NOW CHECK IF THE SECOND STRING IS SUBSTRING OF THE NEW STRING OR NOT
 */
public class CheckIfRotationOFEachOther {
    public static void main(String[] args){
        String s1="ABCDEF";
        String s2="DEFABE";
        String s3=s1.concat(s1);
        System.out.println("Check if rotatoin  or not:"+checkIfSubstring(s3,s2));

    }
    public static boolean checkIfSubstring(String mainString, String subString){
        if(mainString.length()<= subString.length()){
            System.out.println("The string is not substring");
            return false;
        }
        for(int i=0;i< mainString.length();i++){
            int j=0;
            boolean allMatched= false;
            if(mainString.charAt(i)==subString.charAt(j)){
                System.out.println(mainString.charAt(i)+" char matched with :"+subString.charAt(j));
                if(subString.length()>(mainString.length()-i)){
                    // CHECK IF THE SUBSTRING IS BIGGER THAN THE MAIN STRING
                    // AT THE TIME WHEN FIRST CHAR IS MATCHED IN BOTH STRING
                    //System.out.println("THE SUBSTING IS LONGER");
                    return false;
                }
                int l=i+1;
                for(int k=j+1;k<subString.length();k++){
                    if(mainString.charAt(l)!=subString.charAt(k)){
                        allMatched=false;
                        //System.out.println(mainString.charAt(l)+" char do not matched with "+subString.charAt(k));
                        break;
                    }else{
                        //System.out.println(mainString.charAt(l)+" char matched with :"+subString.charAt(k));
                        l++;
                        allMatched= true;
                    }
                }
            }
            if(allMatched){
                //System.out.println("The whole substring matched");
                return true;
            }
        }
        return false;
    }
    
}
