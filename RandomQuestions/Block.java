class Block{
    static {
        System.out.println("In Block");
    }
    {
        System.out.println("Non static block");
    }
    public static void main(String[] args){
        System.out.println("Hellow");
        Block block= new Block();
    }
}

