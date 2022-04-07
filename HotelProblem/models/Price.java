package models;
import java.util.HashMap;

import utils.CustomerType;
import utils.Utils;
public class Price {
    private long id;
    private HashMap<CustomerType,Long> weekdayPrice;
    private HashMap<CustomerType,Long> weekendPrice;
    private HashMap<String,HashMap<CustomerType,Long>> price;

    public Price() {
    }

    public Price(long id, HashMap<CustomerType, Long> weekdayPrice, HashMap<CustomerType, Long> weekendPrice) {
        this.id = id;
        this.weekdayPrice = weekdayPrice;
        this.weekendPrice = weekendPrice;
        this.price = new HashMap<>();
        this.price.put(Utils.WEEKDAY,weekdayPrice);
        this.price.put(Utils.WEEKEND,weekendPrice);
    }

    public HashMap<String, HashMap<CustomerType, Long>> getPrice() {
        return price;
    }

    public void setPrice(HashMap<String, HashMap<CustomerType, Long>> price) {
        this.price = price;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public HashMap<CustomerType, Long> getWeekdayPrice() {
        return weekdayPrice;
    }

    public void setWeekdayPrice(HashMap<CustomerType, Long> weekdayPrice) {
        this.weekdayPrice = weekdayPrice;
    }

    public HashMap<CustomerType, Long> getWeekendPrice() {
        return weekendPrice;
    }

    public void setWeekendPrice(HashMap<CustomerType, Long> weekendPrice) {
        this.weekendPrice = weekendPrice;
    }

    @Override
    public String toString() {
        return "Price [id=" + id + ", weekdayPrice=" + weekdayPrice + ", weekendPrice=" + weekendPrice + "]";
    }
   

}
