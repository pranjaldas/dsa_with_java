class CheckIfIntegerExist{
    public static void main(String[] args){
        String str= "pra1njaldas";
        findInteger(str);
    } 
    public static void findInteger(String str){
        boolean contaisDigit = false;
        for(int i= 0;i< str.length();i++){
            int asci=(int) str.charAt(i);
            if(asci >= 48 && asci <= 57){
                contaisDigit= true;
            }
        }
        if(contaisDigit)
            System.out.println("TRUE");
    }
}