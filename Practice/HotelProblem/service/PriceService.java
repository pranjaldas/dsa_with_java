package service;
import java.util.List;
import models.Price;
import repository.Database;
import utils.CustomerType;

public class PriceService {
    private Database mDatabase;

    public PriceService() {
        this.mDatabase = Database.getDbInstance();
    }
    public Price getPriceByHotelIdAndCTyPrice(CustomerType customerType,long hotelId){
       return mDatabase.getPriceByHIdAndCType(customerType,hotelId);
    }
    public boolean addAllPrices(List<Price> prices){
        return mDatabase.addAll(prices);
    }
    
}
