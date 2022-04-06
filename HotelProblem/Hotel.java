
public class Hotel {
    private long hotelId;
    private String name;
    private Price price;
    private double rating;
    public Hotel(long hotelId, String name, Price price, double rating) {
        this.hotelId = hotelId;
        this.name = name;
        this.price = price;
        this.rating = rating;
    }
    public Hotel() {
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
    public String toString() {
        return "Hotel [hotelId=" + hotelId + ", name=" + name + ", price=" + price.toString() + ", rating=" + rating + "]";
    }
    
   

    

    
}
