/*
 * FIND ALL THE SUBSTRING OF A STRING
 */
public class FindSubstrings {
    public static void main(String[] args){
        printSubstring("abcd");
    }
   
    public static void printSubstring(String string){
        int n= string.length();
        for (int len = 1; len <= n; len++) {
            // Pick ending point
            for (int i = 0; i <= n - len; i++) {
                //  Print characters from current
                // starting point to current ending
                // point. 
                int j = i + len - 1;
                for (int k = i; k <= j; k++) {
                    System.out.print(string.charAt(k));
                }
 
                System.out.println();
            }
        }
        
    }


}
