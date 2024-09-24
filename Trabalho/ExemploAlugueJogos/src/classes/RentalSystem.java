package classes;

import java.util.ArrayList;
import java.util.List;

public class RentalSystem {
    private List<Customer> customers;

    public RentalSystem() {
        this.customers = new ArrayList<>();
    }

    public void addCustomer(Customer customer) {
        customers.add(customer);
    }

    public List<Customer> getCustomers() {
        return customers;
    }
}

