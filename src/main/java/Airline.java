public class Airline {

    public void checkInCustomer(Customer customer, Flight flight){
        flight.addCustomer(customer);
    }

    public void checkInLuggage(Luggage luggage, Flight flight){
        flight.addLuggage(luggage);
    }

    public void checkIn(Ticket ticket){
        //This gets the luggage from the ticket object, and the flight the same way
        checkInLuggage(ticket.getLuggage(), ticket.getFlight());
        //This gets the customer from the ticket object, and the flight the same way
        checkInCustomer(ticket.getCustomer(), ticket.getFlight());
    }
}
