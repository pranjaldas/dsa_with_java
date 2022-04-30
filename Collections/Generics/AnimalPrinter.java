class AnimalPrinter<T extends Animal>{
    private T animal;
    AnimalPrinter(T animal){
        this.animal= animal;
    }
    public void print(){
        System.out.println(animal.toString());
    }
}