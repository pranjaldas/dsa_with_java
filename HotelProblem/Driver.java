import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;

import models.Hotel;
import models.Price;
import models.RequestBody;
import service.DateConversionService;
import service.HotelService;
import service.PriceService;
import utils.CustomerType;

import java.io.IOException;
import java.util.Arrays;
import java.util.Collections;
public class Driver {
    public static HotelService hotelService;
    public static PriceService priceService;
    public static void main(String args[]) throws InterruptedException, IOException{
        hotelService = new HotelService();
        priceService = new PriceService();
        initialization();
    
        RequestBody request = new RequestBody(CustomerType.REGULAR,"26Mar2022,29Mar2022");
        List<String> dates= DateConversionService.findAlldatesBetween(request.getDateRange());
        hotelService.findBestHotelList(request.getCustomerType(), dates);
        System.out.println();
        System.out.println("Please wait.");
        System.out.println("Please wait..");
        System.out.println("Please wait...");
        System.out.println("The Best hotel is: "+hotelService.findBestHotel(request.getCustomerType(), dates));

        
      
        
    
    }
    public static void initialization(){
        Hotel coconutValley= new Hotel(1,"Coconut Valley",3.0);
        List<Price> h1prices= new LinkedList<>();
        h1prices.add(new Price(1,1,CustomerType.REGULAR,Long.valueOf(900),Long.valueOf(1100)));
        h1prices.add(new Price(2,1,CustomerType.REWARDS,Long.valueOf(800),Long.valueOf(800)));
        coconutValley.setPrices(h1prices);
        hotelService.saveHotel(coconutValley);
        priceService.addAllPrices(h1prices);

        Hotel akulamLake= new Hotel(2,"Akulam Lake",4.0);
        List<Price> h2prices= new LinkedList<>();
        h2prices.add(new Price(3,2,CustomerType.REGULAR,Long.valueOf(900),Long.valueOf(1100)));
        h2prices.add(new Price(4,2,CustomerType.REWARDS,Long.valueOf(800),Long.valueOf(800)));
        akulamLake.setPrices(h2prices);
        hotelService.saveHotel(akulamLake);
        priceService.addAllPrices(h2prices);

        Hotel valiBeach= new Hotel(3,"Vali Beach",5.0);
        List<Price> h3prices= new LinkedList<>();
        h3prices.add(new Price(5,3,CustomerType.REGULAR,Long.valueOf(1500),Long.valueOf(2200)));
        h3prices.add(new Price(6,3,CustomerType.REWARDS,Long.valueOf(400),Long.valueOf(1000)));
        valiBeach.setPrices(h3prices);
        hotelService.saveHotel(valiBeach);
        priceService.addAllPrices(h3prices);

        

    }
    
}
