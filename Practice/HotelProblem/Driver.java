import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import models.Hotel;
import models.Price;
import models.RequestBody;
import service.DateConversionService;
import service.HotelService;
import service.PriceService;
import utils.*;
import java.io.IOException;
import java.util.Arrays;
import java.util.Collections;
import java.lang.Runnable;
import java.lang.Thread;

public class Driver {
    public static HotelService hotelService;
    public static PriceService priceService;
    public static void main(String args[]) throws InterruptedException, IOException{
        hotelService = new HotelService();
        priceService = new PriceService();
        Runnable runnable = ()->initialization();
        Thread dataInsertTread= new Thread(runnable);
        dataInsertTread.start();
        dataInsertTread.join();

        ProgressBar progress= new ProgressBar();
        progress.start();
        Runnable runnable2= ()->{
            try{
                Thread.sleep(5000);
                RequestBody request = new RequestBody(CustomerType.REGULAR,"26Mar2022,29Mar2022");
                List<String> dates= DateConversionService.findAlldatesBetween(request.getDateRange());
                progress.stop();
                // hotelService.findBestHotelList(request.getCustomerType(), dates);
                System.out.println();
                System.out.println("The Best hotel is: "+hotelService.findBestHotel(request.getCustomerType(), dates));
            }catch(Exception e){
                e.printStackTrace();
            }finally{
                
            }
           
        };
        Thread t1= new Thread(runnable2);
        t1.start();      

        
      
        
    
    }
    public static void initialization(){
        try{
            Hotel coconutValley= new Hotel(1,"Coconut Valley",3.0);
            Thread.sleep(1000);
            List<Price> h1prices= new LinkedList<>();
            h1prices.add(new Price(1,1,CustomerType.REGULAR,Long.valueOf(900),Long.valueOf(1100)));
            h1prices.add(new Price(2,1,CustomerType.REWARDS,Long.valueOf(800),Long.valueOf(800)));
            coconutValley.setPrices(h1prices);
            hotelService.saveHotel(coconutValley);
            priceService.addAllPrices(h1prices);
            Thread.sleep(1000);

            Hotel akulamLake= new Hotel(2,"Akulam Lake",4.0);
            List<Price> h2prices= new LinkedList<>();
            h2prices.add(new Price(3,2,CustomerType.REGULAR,Long.valueOf(900),Long.valueOf(1100)));
            h2prices.add(new Price(4,2,CustomerType.REWARDS,Long.valueOf(800),Long.valueOf(800)));
            akulamLake.setPrices(h2prices);
            hotelService.saveHotel(akulamLake);
            priceService.addAllPrices(h2prices);
            Thread.sleep(1000);

            Hotel valiBeach= new Hotel(3,"Vali Beach",5.0);
            List<Price> h3prices= new LinkedList<>();
            h3prices.add(new Price(5,3,CustomerType.REGULAR,Long.valueOf(1500),Long.valueOf(2200)));
            h3prices.add(new Price(6,3,CustomerType.REWARDS,Long.valueOf(400),Long.valueOf(1000)));
            valiBeach.setPrices(h3prices);
            hotelService.saveHotel(valiBeach);
            priceService.addAllPrices(h3prices);
            Thread.sleep(1000);
        }catch(Exception e){
            e.printStackTrace();
        }finally{
        }
      


        

    }
    
}
