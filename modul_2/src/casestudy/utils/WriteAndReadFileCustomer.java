package casestudy.utils;

import casestudy.model.people.Customer;
import casestudy.model.people.Employee;
import casestudy.views.CustomerInput;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class WriteAndReadFileCustomer {
    File fileCustomer = new File("src/casestudy/data/customerDATA.csv");

    public void writeCustomer(List<Customer> customerList) throws IOException {


        Customer customer = CustomerInput.inputCustomer();
        customerList.add(customer);

        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(fileCustomer));
        for (Customer c : customerList) {
            bufferedWriter.write(c.toString());
            bufferedWriter.newLine();
        }
        bufferedWriter.close();
    }

    public List<Customer> readCustomer() throws IOException {
        List<Customer> customerlist = new ArrayList<>();
        BufferedReader bufferedReader = new BufferedReader(new FileReader(fileCustomer));
        String line ="";
        while (true) {
            line = bufferedReader.readLine();

            if (line==null) {
                break;
            }
            String[] str = line.split(",");
            String name = str[0];
            String dateOfBirth = str[1];
            String gender = str[2];
            String id = str[3];
            String phoneNumber = str[4];
            String Email = str[5];
            String idEmployee = str[6];
            String rankCustomer = str[7];
            String address = str[8];
            Customer customer = new Customer(name,dateOfBirth,gender,id,phoneNumber,Email,idEmployee,rankCustomer,address);
            customerlist.add(customer);
        }
        return customerlist;
    }
}
