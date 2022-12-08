package casestudy.services.impl;

import casestudy.model.people.Customer;
import casestudy.model.people.Employee;
import casestudy.services.ICustomerService;
import casestudy.utils.WriteAndReadFileCustomer;

import java.io.IOException;
import java.util.List;

public class CustomerServiceImpl implements ICustomerService {

    WriteAndReadFileCustomer w = new WriteAndReadFileCustomer();

    @Override
    public void addNew() {
        try {
            w.writeCustomer();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public void editCus(Customer customer) {
        List<Customer> customerList;
        try {
            customerList = w.readCustomer();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        for (Customer customer1 : customerList) {
            if (customer1.getIdCustomer().equals(customer.getIdCustomer())) {
                customer1.setName(customer.getName());
                customer1.setDateOfBirth(customer.getDateOfBirth());
                customer1.setGender(customer.getGender());
                customer1.setId(customer.getId());
                customer1.setPhoneNumber(customer.getPhoneNumber());
                customer1.setEmail(customer.getEmail());
                customer1.setRankCustomer(customer.getRankCustomer());
                customer1.setAddress(customer.getAddress());
                break;
            }
        }
        try {
            w.writeCustomer();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }


    @Override
    public void displayAll() {
        try {
            w.readCustomer();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
