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
}
