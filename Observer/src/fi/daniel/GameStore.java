package fi.daniel;

import java.util.ArrayList;
import java.util.List;

//Subject
public class GameStore {

    private List<Customer> customersList = new ArrayList<>();
    private Sale sale;

    public void addCustomer(Customer customer){
        customersList.add(customer);
    }

    public void removeCustomer(Customer customer){
        customersList.remove(customer);
    }

    public void newSale(Sale sale){
        this.sale = sale;
        notifyCustomers();
    }

    private void notifyCustomers(){
        for (Customer customer : customersList){
            customer.notifySale(sale);
        }
    }
}
