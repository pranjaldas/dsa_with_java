class Dog extends Animal{
    private int numberOfTeeth;
    Dog(String sound,int numberOfTeeth){
        super(sound);
        this.numberOfTeeth=numberOfTeeth;
    }


    /**
     * @return int return the numberOfTeeth
     */
    public int getNumberOfTeeth() {
        return numberOfTeeth;
    }

    /**
     * @param numberOfTeeth the numberOfTeeth to set
     */
    public void setNumberOfTeeth(int numberOfTeeth) {
        this.numberOfTeeth = numberOfTeeth;
    }
    @Override
    public String toString() {
        return "Dog sounds: "+super.getSound();
    }
}