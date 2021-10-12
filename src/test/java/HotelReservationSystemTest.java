import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;



public class HotelReservationSystemTest {
    ArrayList<Hotelinfo> list=new ArrayList<>();
    HotelReservationSystem hotelReservation=new HotelReservationSystem();
    Hotelinfo info=new Hotelinfo("abhi",256);

    @Before
    public void setUp()  {
        hotelReservation=new HotelReservationSystem();

    }

    @Test
    public void whenhoteladded_shouldreturn_addHotel() {
        try {
            boolean result1 =hotelReservation.addHotel(new Hotelinfo("abhi", 123));
            Assert.assertEquals(true,result1);

        }catch (UserException e){
                 e.printStackTrace();
        }
    }

    @Test
    public void whenhotelnotenter_shouldreturn_false(){
        try {
            boolean result= hotelReservation.addHotel(new Hotelinfo(null,432));
            Assert.assertEquals(true,result);
        }catch (UserException e){
            e.printStackTrace();
        }
    }

    @Test
    public void whenhotelnotadded_shouldreturn_false(){
        try {

                boolean result= hotelReservation.addHotel(new Hotelinfo(null,1232));
                Assert.assertEquals(false,result);
        }catch (UserException e){
            e.printStackTrace();
        }
    }
}