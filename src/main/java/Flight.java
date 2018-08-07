import java.util.ArrayList;

public class Flight {

    private ArrayList<Customer> customers;
    private ArrayList<Luggage> luggage;

    public Flight(){
    customers = new ArrayList<>();
    luggage = new ArrayList<>();
    }

    public int countCustomers(){
        return this.customers.size();
    }

    public int countLuggage(){
        return this.luggage.size();
    }

    public void addCustomer(Customer customer){
        this.customers.add(customer);
    }
    public void addLuggage(Luggage luggage){
        this.luggage.add(luggage);
    }
}
