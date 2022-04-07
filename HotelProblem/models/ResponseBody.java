package models;

public class ResponseBody implements Comparable<ResponseBody>{
    private String hotelName;
    private long price;
    private double rating;
    public ResponseBody() {
    }
    public ResponseBody(String hotelName, long price, double rating) {
        this.hotelName = hotelName;
        this.price = price;
        this.rating = rating;
    }
    public String getHotelName() {
        return hotelName;
    }
    public void setHotelName(String hotelName) {
        this.hotelName = hotelName;
    }
    public long getPrice() {
        return price;
    }
    public void setPrice(long price) {
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
        return "ResponseBody [hotelName=" + hotelName + ", price=" + price + ", rating=" + rating + "]";
    }
    @Override
    public int compareTo(ResponseBody o) {
        if(this.getPrice()== o.getPrice()){
            if(this.getRating() < o.getRating())
                return 1;
            else 
                return -1;
        }else{
            if(this.getPrice() > o.getPrice())
                return 1;
            else 
                return -1;
        }
    }
    
    
}
