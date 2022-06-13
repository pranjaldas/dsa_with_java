public class RemoveDuplicate {
    public static void main(String[] args){
        String string = "geeksforgeeks";
        removeDuplicate(string);
    }
    public static String removeDuplicate(String string){
        char[] charArray= string.toCharArray();
        char[] removeDuplicate= new char[charArray.length];
        int k=0;
        for(int i=0;i<charArray.length;i++){
            System.out.println("for char: "+charArray[i]);
            boolean duplicateFound= false;
            for(int j=i+1; j<charArray.length;j++){
                if(charArray[i]==charArray[j]){
                    duplicateFound= true;
                    System.out.println(charArray[i]+" is duplicate");
                }
            }
            if(!duplicateFound){
                removeDuplicate[k]=charArray[i];
                k++;
                duplicateFound=false;
            }
            
        }
        System.out.println(new String(removeDuplicate));
        return new String(removeDuplicate);
    }
    
}
