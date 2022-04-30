class WildcardPrinter<? extends Animal>{
    private ? animal;
    WildcardPrinter(? animal){
        this.animal= animal;
    }
    public void print(){
        System.out.println(animal.toString());
    }
}