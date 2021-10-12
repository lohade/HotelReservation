public class Hotelinfo {

    private String hotel_name;
    private int rate_weekday;


    public Hotelinfo(String hotel_name,int rate_weekday) {
        this.hotel_name=hotel_name;
        this.rate_weekday=rate_weekday;
    }

    public int getRate_weekday() {
        return this.rate_weekday;
    }

    public void setRate_weekday(int rate_weekday) {

        this.rate_weekday = rate_weekday;
    }

    public String getHotel_name() {

        return this.hotel_name;
    }

    public void setHotel_name(String hotel_name) {
        this.hotel_name = hotel_name;
    }

    public String toString() {
        return "hotel name: " + this.hotel_name + "\trate of hotel in weekday:" + this.rate_weekday ;
    }

}
