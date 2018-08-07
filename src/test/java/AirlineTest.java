import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class AirlineTest {

    Airline airline1;
    Customer customer1;
    Flight flight1;
    Luggage luggage1;

    @Before
    public void before(){
        airline1 = new Airline();
        customer1 = new Customer("Mike");
        flight1 = new Flight();
        luggage1 = new Luggage();
    }

    @Test
    public void canCheckCustomerIntoFlight(){
        airline1.checkInCustomer(customer1, flight1);
        assertEquals(1, flight1.countCustomers());
    }

    @Test
    public void canCheckInLuggage(){
        airline1.checkInLuggage(luggage1, flight1);
        assertEquals(1, flight1.countLuggage());
    }
}
