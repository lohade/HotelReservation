public class HotelInformation {

    private String hotel_name;
    private String customer_type;
    private  String rate_weekday;
    private String rate_weekend;

    public String getRate_weekday() {
        return rate_weekday;
    }

    public void setRate_weekday(String rate_weekday) {
        this.rate_weekday = rate_weekday;
    }

    public String getRate_weekend() {
        return rate_weekend;
    }

    public void setRate_weekend(String rate_weekend) {
        this.rate_weekend = rate_weekend;
    }

    public String getCustomer_type() {
        return customer_type;
    }

    public void setCustomer_type(String customer_type) {
        this.customer_type = customer_type;
    }

    public String getHotel_name() {
        return hotel_name;
    }

    public void setHotel_name(String hotel_name) {
        this.hotel_name = hotel_name;
    }


    public String toString(){
        return ("hotel name: "+ hotel_name+ "\nrate of hotel in weekday:" +rate_weekday+ "\n rate of hotel in weekend:"+rate_weekend);

    }
}
