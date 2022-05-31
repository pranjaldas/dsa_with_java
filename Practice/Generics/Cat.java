class Cat extends Animal{
    private int numberOfLegs;
    Cat(String sound,int numberOfLegs){
        super(sound);
        this.numberOfLegs= numberOfLegs;
    }
    Cat(){
        
    }


    /**
     * @return int return the numberOfLegs
     */
    public int getNumberOfLegs() {
        return numberOfLegs;
    }

    /**
     * @param numberOfLegs the numberOfLegs to set
     */
    public void setNumberOfLegs(int numberOfLegs) {
        this.numberOfLegs = numberOfLegs;
    }
    @Override
    public String toString() {
        return "Cat sounds: "+super.getSound();
    }

}