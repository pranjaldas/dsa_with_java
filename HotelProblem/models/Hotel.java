package models;

import java.util.List;
public class Hotel {
    private long hotelId;
    private String name;
    private double rating;
    private List<Price> prices;
    public Hotel(long hotelId, String name, double rating) {
        this.hotelId = hotelId;
        this.name = name;
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
    public double getRating() {
        return rating;
    }
    public void setRating(double rating) {
        this.rating = rating;
    }
    public List<Price> getPrices() {
        return prices;
    }
    public void setPrices(List<Price> prices) {
        this.prices = prices;
    }
    @Override
    public String toString() {
        return "Hotel [hotelId=" + hotelId + ", name=" + name + ", prices=" + prices + ", rating=" + rating + "]";
    }
    
}
