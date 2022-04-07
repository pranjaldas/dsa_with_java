package service;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;

import models.Hotel;
import repository.Database;
import utils.CustomerType;
public class HotelService {
    private Database mDatabase;
    public HotelService() {
        this.mDatabase= new Database();
    }
    public void saveHotel(Hotel hotel){
        this.mDatabase.saveHotel(hotel);
        System.out.println("Hotel Stored succesfully");
    }
    public Hotel findHotelById(long id){
       return mDatabase.getHotelById(id);
    }
    public List<Hotel> getAll(){
        return mDatabase.fetchAll();
    }
    public List<Hotel> findBestHotel(CustomerType tCustomerType, List<String> dates){
        List<Hotel> results = new LinkedList<>();
        getAll().forEach(hotel->{
            Long price = 0L;
            for(String day: dates){
                price +=hotel.getPrice().getPrice().get(day).get(tCustomerType);
            }
            hotel.setCalculativeCost(price);
            results.add(hotel);
        });
        return results;
    }
}
