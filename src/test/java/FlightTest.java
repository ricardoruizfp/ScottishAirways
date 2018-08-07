import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class FlightTest {

    Flight flight;
    @Before
    public void before(){
        flight = new Flight();
    }

    @Test
    public void flightStartsEmpty(){
        assertEquals(0, flight.countCustomers());
    }
}
