package repository;
import java.util.*;

import models.Hotel;
public class Database {
    private List<Hotel> hotels = new ArrayList<>();

    public Database() {
    }
    public boolean saveHotel(Hotel hotel){
        hotels.add(hotel);
        return true;
    }
    public Hotel getHotelById(long id){
        return hotels.stream().filter(hotel->
            hotel.getHotelId()== id
        ).findFirst().get();
    }
    public List<Hotel> fetchAll(){
        return hotels;
    }
   

   
}
