import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;
import static junit.framework.TestCase.assertFalse;

public class FlightTest {

    Flight flight1;
    Customer customer1;
    @Before
    public void before(){
        flight1 = new Flight();
        customer1 = new Customer("Ms Customer");
    }

    @Test
    public void flightStartsEmpty(){
        assertEquals(0, flight1.countCustomers());
    }

    @Test
    public void canAddCustomer(){
        flight1.addCustomer(customer1);
        assertEquals(1, flight1.countCustomers());
    }

}
