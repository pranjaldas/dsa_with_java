class Animal{
    private String sound;
    Animal(String sound){
        this.sound= sound;
    }
    public void sound(String sound){
        System.out.println(sound);
    }
        /**
     * @return String return the sound
     */
    public String getSound() {
        return sound;
    }

    /**
     * @param sound the sound to set
     */
    public void setSound(String sound) {
        this.sound = sound;
    }

}