import java.util.ArrayList;


public class HotelReservationSystem {

    private ArrayList<Hotelinfo> list=new ArrayList<>();



    public boolean addHotel(Hotelinfo hotel_name) throws UserException {
        try {
            if (hotel_name == null) {
                        throw new UserException("hotel name cannot be empty");
            }
            list.add(hotel_name);
                }catch (UserException e){
                    e.printStackTrace();
                }
        return list.add(hotel_name);

            }


    public void display(){
        System.out.println(list);
    }
    public static void main(String[] args){
        System.out.println("Welcome to Hotel Reservation System");


    }


}
