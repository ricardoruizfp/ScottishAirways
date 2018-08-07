import java.util.ArrayList;

public class Flight {

    private ArrayList<Customer> customers;

    public Flight(){
    customers = new ArrayList<>();
    }

    public ArrayList<Customer> getCustomers()
    {
        return this.customers;
    }
}
