package service;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

import models.Hotel;
import models.ResponseBody;
import repository.Database;
import utils.CustomerType;
import utils.Utils;
public class HotelService {
    private Database mDatabase;
    public HotelService() {
        this.mDatabase= Database.getDbInstance();
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
    public void findBestHotelList(CustomerType tCustomerType, List<String> dates){
        List<ResponseBody> results = new LinkedList<>();
        mDatabase.fetchAll().forEach(hotel->{
            long price= 0L;
            for(String date:dates){
                if(date.equals(Utils.WEEKDAY))
                    price += mDatabase.getPriceByHIdAndCType(tCustomerType, hotel.getHotelId()).getWeekdayPrice();
                else
                    price += mDatabase.getPriceByHIdAndCType(tCustomerType, hotel.getHotelId()).getWeekendPrice();
            }
            results.add(new ResponseBody(hotel.getName(),price,hotel.getRating())); 
        });
        Collections.sort(results);
        results.forEach(result->{
            System.out.println("Hotel Name : "+result.getHotelName()+", Price : "+result.getPrice()+", Rating : "+result.getRating());
        });
    }
    public String findBestHotel(CustomerType tCustomerType, List<String> dates){
        List<ResponseBody> results = new LinkedList<>();
        mDatabase.fetchAll().forEach(hotel->{
            long price= 0L;
            for(String date:dates){
                if(date.equals(Utils.WEEKDAY))
                    price += mDatabase.getPriceByHIdAndCType(tCustomerType, hotel.getHotelId()).getWeekdayPrice();
                else
                    price += mDatabase.getPriceByHIdAndCType(tCustomerType, hotel.getHotelId()).getWeekendPrice();
            }
            results.add(new ResponseBody(hotel.getName(),price,hotel.getRating())); 
        });
        Collections.sort(results);
        return results.get(0).getHotelName();
    }
}
