public class Apple extends Food implements Eadable{
    private String name;
    private String color;
    Apple(String taste,String name, String color) {
        super(taste);
        this.name = name;
        this.color = color;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }
    @Override
    public String toString() {
        return super.toString()+" type = Fruit color=" + color + ", name=" + name + "]";
    }
    
    
}
