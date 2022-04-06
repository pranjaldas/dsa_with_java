public class Price {
    private long id;
    private long weekendPriceRegular;
    private long weekendPriceRewards;
    private long weekdayPriceRegular;
    private long weekdayPriceRewards;
    public Price() {
    }
    public Price(long id, long weekendPriceRegular, long weekendPriceRewards, long weekdayPriceRegular,
            long weekdayPriceRewards) {
        this.id = id;
        this.weekendPriceRegular = weekendPriceRegular;
        this.weekendPriceRewards = weekendPriceRewards;
        this.weekdayPriceRegular = weekdayPriceRegular;
        this.weekdayPriceRewards = weekdayPriceRewards;
    }
    public long getId() {
        return id;
    }
    public void setId(long id) {
        this.id = id;
    }
    public long getWeekendPriceRegular() {
        return weekendPriceRegular;
    }
    public void setWeekendPriceRegular(long weekendPriceRegular) {
        this.weekendPriceRegular = weekendPriceRegular;
    }
    public long getWeekendPriceRewards() {
        return weekendPriceRewards;
    }
    public void setWeekendPriceRewards(long weekendPriceRewards) {
        this.weekendPriceRewards = weekendPriceRewards;
    }
    public long getWeekdayPriceRegular() {
        return weekdayPriceRegular;
    }
    public void setWeekdayPriceRegular(long weekdayPriceRegular) {
        this.weekdayPriceRegular = weekdayPriceRegular;
    }
    public long getWeekdayPriceRewards() {
        return weekdayPriceRewards;
    }
    public void setWeekdayPriceRewards(long weekdayPriceRewards) {
        this.weekdayPriceRewards = weekdayPriceRewards;
    }
    @Override
    public String toString() {
        return "Price [id=" + id + ", weekdayPriceRegular=" + weekdayPriceRegular + ", weekdayPriceRewards="
                + weekdayPriceRewards + ", weekendPriceRegular=" + weekendPriceRegular + ", weekendPriceRewards="
                + weekendPriceRewards + "]";
    }


}
