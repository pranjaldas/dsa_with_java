package repository;
import java.util.*;
import models.*;
import utils.CustomerType;
public class Database {
    private static Database single_instance = null;
    private List<Hotel> hotels;
    private List<Price> prices;

    private Database() {
        hotels  = new ArrayList<>();
        prices =  new ArrayList<>();
    }
    // TO IMPLEMENT SINGLETON OBJECT
    public static Database getDbInstance(){
        if (single_instance == null)
            single_instance = new Database();
        return single_instance;
    }
    public boolean saveHotel(Hotel hotel){
        
        return hotels.add(hotel);
    }
    public Hotel getHotelById(long id){
        return hotels.stream().filter(hotel->
            hotel.getHotelId()== id
        ).findFirst().get();
    }
    public List<Hotel> fetchAll(){
        return hotels;
    }

    public boolean savePrice(Price price){
        return prices.add(price);
    }

    public Price getPriceByHIdAndCType(CustomerType customerType,long hotelId){
        return prices.stream().filter(price-> price.getCustomerType().equals(customerType) && price.getHotelId()==hotelId).findFirst().get();
    }
    public boolean addAll(List<Price> prices2) {
        return prices.addAll(prices2);
    }
   

   
}
