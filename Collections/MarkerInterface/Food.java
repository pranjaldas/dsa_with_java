public class Food {
    public static int ID= 1;
    private String taste;
    Food(String taste){
        this.taste=taste;
    }

    public String getTaste() {
        return taste;
    }

    public void setTaste(String taste) {
        this.taste = taste;
    }

    public void canEat() throws FoodNotEadableException{
        if( this instanceof Eadable)
            System.out.println("Can eat");
        else
            throw new FoodNotEadableException("Can not eat the food");
    }

    @Override
    public String toString() {
        return "Food [taste=" + taste + "";
    }
    
}
