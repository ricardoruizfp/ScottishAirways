public class Ticket {

    private Customer customer;
    private Luggage luggage; //Ricardo disagrees
    private Flight flight;

    public Ticket(Customer customer, Luggage luggage, Flight flight) {
        this.customer = customer;
        this.luggage = luggage;
        this.flight = flight;
    }

    public Customer getCustomer() {
        return customer;
    }

    public Luggage getLuggage() {
        return luggage;
    }

    public Flight getFlight() {
        return flight;
    }
}
