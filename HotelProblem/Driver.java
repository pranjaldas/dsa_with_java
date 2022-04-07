import java.util.HashMap;
import java.util.List;
import java.util.Arrays;
import java.util.Collections;
public class Driver {
    public static HotelService hotelService;
    public static void main(String args[]){
        hotelService = new HotelService();
        initialization();
        // System.out.println(hotelService.findHotelById(1).toString());
        // List<Hotel> hotels = hotelService.getAll();
        // Collections.sort(hotels);
        // System.out.println(Arrays.toString(hotels.toArray()));
        RequestBody request = new RequestBody(CustomerType.REGULAR,"28Mar2022,26Mar2022");
        List<String> days= DateConversionService.convertToDay(request.getDateRange());
        System.out.println(Arrays.toString(days.toArray()));
        
        





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
        weekdayPrice1.put(CustomerType.REGULAR, Long.valueOf(1600));
        weekdayPrice1.put(CustomerType.REWARDS,Long.valueOf(1100));
        HashMap<CustomerType,Long> weekendPrice1= new HashMap<>();
        weekendPrice1.put(CustomerType.REGULAR, Long.valueOf(600));
        weekendPrice1.put(CustomerType.REWARDS,Long.valueOf(500));
        Hotel akulamLake= new Hotel(2,"Akulam Lake",
        new Price(1,weekdayPrice,weekendPrice),4.0);
        hotelService.saveHotel(akulamLake);

        HashMap<CustomerType,Long> weekdayPrice2= new HashMap<>();
        weekdayPrice2.put(CustomerType.REGULAR, Long.valueOf(2200));
        weekdayPrice2.put(CustomerType.REWARDS,Long.valueOf(1000));
        HashMap<CustomerType,Long> weekendPrice2= new HashMap<>();
        weekendPrice2.put(CustomerType.REGULAR, Long.valueOf(1500));
        weekendPrice2.put(CustomerType.REWARDS,Long.valueOf(400));
        Hotel valiBeach= new Hotel(3,"Vali Beach",
        new Price(1,weekdayPrice,weekendPrice),5.0);
        hotelService.saveHotel(valiBeach);
    }
    
}
