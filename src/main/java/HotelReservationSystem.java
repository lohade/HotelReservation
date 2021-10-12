import java.util.ArrayList;
<<<<<<< HEAD


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

=======
import java.util.Scanner;

public class HotelReservationSystem {

    ArrayList<HotelInformation> list=new ArrayList<>();
    Scanner scanner=new Scanner(System.in);


    public void addHotel(){
        HotelInformation info=new HotelInformation();
        boolean add=true;
        do {
            System.out.println("enter 1 to add data else 0:");
            int choice=scanner.nextInt();
            if (choice == 1) {

                System.out.println("enter hotel name");
                String hotel_name = scanner.next();
                info.setHotel_name(hotel_name);

                System.out.println("enter rate of regular customer in weekend");
                String rate = scanner.next();
                info.setRate_weekday(rate);

                System.out.println("enter rate of hotel in weekend");
                String rate_weekend = scanner.next();
                info.setRate_weekend(rate_weekend);

                list.add(info);
            }

            else{
                add=false;
            }
        }while (add);

        display();

    }
>>>>>>> uc1_addinghotelname

    public void display(){
        System.out.println(list);
    }
    public static void main(String[] args){
        System.out.println("Welcome to Hotel Reservation System");
<<<<<<< HEAD


=======
        HotelReservationSystem reservationSystem=new HotelReservationSystem();
        reservationSystem.addHotel();
>>>>>>> uc1_addinghotelname
    }


}
