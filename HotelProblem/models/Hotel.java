package models;

public class Hotel implements Comparable<Hotel> {
    private long hotelId;
    private String name;
    private Price price;
    private double rating;
    private long calculativeCost;
    public Hotel(long hotelId, String name, Price price, double rating) {
        this.hotelId = hotelId;
        this.name = name;
        this.price = price;
        this.rating = rating;
    }
    public Hotel() {
    }
    
    public void setPrice(Price price) {
        this.price = price;
    }
    public long getCalculativeCost() {
        return calculativeCost;
    }
    public void setCalculativeCost(long calculativeCost) {
        this.calculativeCost = calculativeCost;
    }
    public long getHotelId() {
        return hotelId;
    }
    public void setHotelId(long hotelId) {
        this.hotelId = hotelId;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public Price getPrice() {
        return price;
    }
    public void setPriceId(Price price) {
        this.price = price;
    }
    public double getRating() {
        return rating;
    }
    public void setRating(double rating) {
        this.rating = rating;
    }
    @Override
    public int compareTo(Hotel nexthotel){
        if(this.getCalculativeCost()==nexthotel.calculativeCost){
            if(this.getRating() > nexthotel.getRating())
                return -1;
            else 
                return 1;
        }else{
            // System.out.println(this.calculativeCost+" i am here with"+nexthotel.getCalculativeCost());
            if(this.getCalculativeCost() < nexthotel.getCalculativeCost())
                return -1;
            else 
                return 1;
        }
    }
    @Override
    public String toString() {
        return "Hotel [hotelId=" + hotelId + ", name=" + name + ", price=" + price.toString() + ", rating=" + rating + "]";
    }
    
   

    

    
}
