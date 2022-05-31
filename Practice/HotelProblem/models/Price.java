package models;
import utils.CustomerType;
public class Price {
    
    private long id;
    private long hotelId;
    private CustomerType customerType;
    private long weekendPrice;
    private long weekdayPrice;
    

    public Price(long id, long hotelId, CustomerType customerType, long weekendPrice, long weekdayPrice) {
        this.id = id;
        this.hotelId = hotelId;
        this.customerType = customerType;
        this.weekendPrice = weekendPrice;
        this.weekdayPrice = weekdayPrice;
    }

    public Price() {
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public long getHotelId() {
        return hotelId;
    }

    public void setHotelId(long hotelId) {
        this.hotelId = hotelId;
    }

    public CustomerType getCustomerType() {
        return customerType;
    }

    public void setCustomerType(CustomerType customerType) {
        this.customerType = customerType;
    }

    public long getWeekendPrice() {
        return weekendPrice;
    }

    public void setWeekendPrice(long weekendPrice) {
        this.weekendPrice = weekendPrice;
    }

    public long getWeekdayPrice() {
        return weekdayPrice;
    }

    public void setWeekdayPrice(long weekdayPrice) {
        this.weekdayPrice = weekdayPrice;
    }

    @Override
    public String toString() {
        return "Price [customerType=" + customerType + ", hotelId=" + hotelId + ", id=" + id + ", weekdayPrice="
                + weekdayPrice + ", weekendPrice=" + weekendPrice + "]";
    }
    

   
}
