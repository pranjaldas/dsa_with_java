import java.util.HashMap;
import java.util.List;

import models.Hotel;
import models.Price;
import models.RequestBody;
import service.DateConversionService;
import service.HotelService;
import utils.CustomerType;

import java.io.IOException;
import java.util.Arrays;
import java.util.Collections;
public class Driver {
    public static HotelService hotelService;
    public static void main(String args[]) throws InterruptedException, IOException{
        hotelService = new HotelService();
        initialization();
        // System.out.println(hotelService.findHotelById(1).toString());
        // List<Hotel> hotels = hotelService.getAll();
        // Collections.sort(hotels);
        // System.out.println(Arrays.toString(hotels.toArray()));
        RequestBody request = new RequestBody(CustomerType.REGULAR,"27Mar2022,26Mar2022");
        List<String> days= DateConversionService.convertToDay(request.getDateRange());
        //System.out.println(Arrays.toString(days.toArray()));
        List<Hotel> bestHotels = hotelService.findBestHotel(request.getCustomerType(), days);
        Collections.sort(bestHotels);
        
        String anim= "|/-\\";
        try {
            for (int x =0 ; x < 50 ; x++) {
                String data = "\r" + anim.charAt(x % anim.length()) + " " + x;
                System.out.write(data.getBytes());
                Thread.sleep(100);
            }
            System.out.println();
            // for (Hotel hotel : bestHotels) {
            //     System.out.println("Hotel name: "+hotel.getName()+", rating: "+hotel.getRating()+", calculative price: "+hotel.getCalculativeCost());
            // }
            System.out.println("Best Suggested Hotel name: "+bestHotels.get(0).getName()+", rating: "+bestHotels.get(0).getRating()+", calculative price: "+bestHotels.get(0).getCalculativeCost());

        } catch (Exception e) {
            e.printStackTrace();
        }
       

      
        
        
        





    }
    public static void initialization(){
        HashMap<CustomerType,Long> weekdayPrice= new HashMap<>();
        weekdayPrice.put(CustomerType.REGULAR, Long.valueOf(1100));
        weekdayPrice.put(CustomerType.REWARDS,Long.valueOf(800));
        HashMap<CustomerType,Long> weekendPrice= new HashMap<>();
        weekendPrice.put(CustomerType.REGULAR, Long.valueOf(900));
        weekendPrice.put(CustomerType.REWARDS,Long.valueOf(800));
        Hotel coconutValley= new Hotel(1,"Coconut Valley",
        new Price(1,weekdayPrice,weekendPrice),3.0);
        hotelService.saveHotel(coconutValley);
      
        HashMap<CustomerType,Long> weekdayPrice1= new HashMap<>();
        weekdayPrice1.put(CustomerType.REGULAR, Long.valueOf(1100));
        weekdayPrice1.put(CustomerType.REWARDS,Long.valueOf(800));
        HashMap<CustomerType,Long> weekendPrice1= new HashMap<>();
        weekendPrice1.put(CustomerType.REGULAR, Long.valueOf(900));
        weekendPrice1.put(CustomerType.REWARDS,Long.valueOf(800));
        Hotel akulamLake= new Hotel(2,"Akulam Lake",
        new Price(2,weekdayPrice1,weekendPrice1),4.0);
        hotelService.saveHotel(akulamLake);

        HashMap<CustomerType,Long> weekdayPrice2= new HashMap<>();
        weekdayPrice2.put(CustomerType.REGULAR, Long.valueOf(2200));
        weekdayPrice2.put(CustomerType.REWARDS,Long.valueOf(1000));
        HashMap<CustomerType,Long> weekendPrice2= new HashMap<>();
        weekendPrice2.put(CustomerType.REGULAR, Long.valueOf(1500));
        weekendPrice2.put(CustomerType.REWARDS,Long.valueOf(400));
        Hotel valiBeach= new Hotel(3,"Vali Beach",
        new Price(3,weekdayPrice2,weekendPrice2),5.0);
        hotelService.saveHotel(valiBeach);
    }
    
}
