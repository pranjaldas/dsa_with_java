class Orange extends Food{
    private String name;
    private String color;
    Orange(String taste,String name, String color) {
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