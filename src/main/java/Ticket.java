import java.util.ArrayList;

public class Ticket {

    private Customer customer;
    private ArrayList<Luggage> luggage;
    private Flight flight;


    public Ticket(Customer customer, Flight flight) {
        this.customer = customer;
        this.luggage = new ArrayList<Luggage>();
        this.flight = flight;
    }

    public Customer getCustomer() {
        return customer;
    }

    public Flight getFlight() {
        return flight;
    }

    public int countLuggage(){
        return this.luggage.size();
    }

    public void addLuggage(Luggage luggage){
        this.luggage.add(luggage);
    }


}
