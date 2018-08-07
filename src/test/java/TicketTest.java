import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TicketTest {

    Flight flight1;
    Luggage luggage1;
    Customer customer1;
    Ticket ticket1;

    @Before
    public void before(){
        customer1 = new Customer("Count Luggage");
        luggage1 = new Luggage();
        flight1 = new Flight();
        ticket1 = new Ticket(customer1, luggage1, flight1);
    }

    @Test
    public void ticketHasCustomer(){
        assertEquals(customer1, ticket1.getCustomer());
    }

    @Test
    public void ticketHasFlight(){
        assertEquals(flight1, ticket1.getFlight());

    }

    @Test
    public void ticketHasLuggage(){
        assertEquals(luggage1, ticket1.getLuggage());
    }
}
