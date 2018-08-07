import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class AirlineTest {

    Airline airline;
    Customer customer;

    @Before
    public void before(){
        airline = new Airline();
        customer = new Customer("Mike");

    }

    @Test
    public void canCheckIn(){
        assertTrue(airline.checkInCustomer(customer));
    }
}
