import javax.xml.ws.Holder;
public class Driver {
    public static HotelService hotelService;
    public static void main(String args[]){
        hotelService = new HotelService();
        initialization();

        System.out.println(hotelService.findHotelById(1).toString());




    }
    public static void initialization(){
        Hotel h1= new Hotel(1,"Hotel 1",new Price(1,400,500,800,900),3.7);
        hotelService.saveHotel(h1);
        Hotel h2= new Hotel(2,"Hotel 2",new Price(2,300,400,900,1000),4.0);
        hotelService.saveHotel(h2);
    }
    
}
