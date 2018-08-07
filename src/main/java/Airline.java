public class Airline {

    public void checkInCustomer(Customer customer, Flight flight){
        flight.addCustomer(customer);
    }

    public void checkInLuggage(Luggage luggage, Flight flight){
        flight.addLuggage(luggage);
    }
}
