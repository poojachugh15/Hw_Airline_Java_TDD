import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PassengerTest {

    private Passenger passenger;

    @Before
    public void before(){
        passenger = new Passenger("Robert Jackson", 2);

    }

    @Test
    public void canGetName() {
        assertEquals("Robert Jackson", passenger.getPassengerName());
    }

    @Test
    public void canGetNumberOfBags() {
        assertEquals(2, passenger.getNumberOfBags());
    }


}
