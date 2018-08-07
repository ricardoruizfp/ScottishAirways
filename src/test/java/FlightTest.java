import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;
import static junit.framework.TestCase.assertFalse;

public class FlightTest {

    Flight flight1;
    Customer customer1;
    Luggage luggage1;
    @Before
    public void before(){
        flight1 = new Flight();
        customer1 = new Customer("Ms Customer");
        luggage1 = new Luggage();
    }

    @Test
    public void flightStartsDevoidOfCustomers(){
        assertEquals(0, flight1.countCustomers());
    }

    @Test
    public void flightStartsDevoidOfLuggage(){
        assertEquals(0, flight1.countLuggage());
    }

    @Test
    public void canAddCustomer(){
        flight1.addCustomer(customer1);
        assertEquals(1, flight1.countCustomers());
    }

    @Test
    public void canAddLuggage(){
        flight1.addLuggage(luggage1);
        assertEquals(1, flight1.countLuggage());
    }

}
