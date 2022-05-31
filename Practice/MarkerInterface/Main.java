class Main{
    public static void main(String[] args){
        Food food = new Apple("sweet","kashmiri Apple","red");
        Food food1= new Orange("sour","Tangy oranges","orange");
        System.out.println(food.toString());
        try{
            food.canEat();
            food1.canEat();
        }catch(FoodNotEadableException e){
            System.out.println(e.getMessage());
        }
        
    }
}