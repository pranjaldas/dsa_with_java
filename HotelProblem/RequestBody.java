public class RequestBody {
    private CustomerType customerType;
    private String dateRange;
    
    public RequestBody() { 
    }
    public RequestBody(CustomerType customerType, String dateRange) {
        this.customerType = customerType;
        this.dateRange = dateRange;
    }
    public CustomerType getCustomerType() {
        return customerType;
    }
    public void setCustomerType(CustomerType customerType) {
        this.customerType = customerType;
    }
    public String getDateRange() {
        return dateRange;
    }
    public void setDateRange(String dateRange) {
        this.dateRange = dateRange;
    }
    @Override
    public String toString() {
        return "RequestBody [customerType=" + customerType + ", dateRange=" + dateRange + "]";
    }
    
    
}
