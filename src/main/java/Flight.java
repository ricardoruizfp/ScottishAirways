import java.util.ArrayList;

public class Flight {

    private ArrayList<Customer> customers;

    public Flight(){
    customers = new ArrayList<>();
    }

    public int countCustomers(){
        return this.customers.size();
    }
}
