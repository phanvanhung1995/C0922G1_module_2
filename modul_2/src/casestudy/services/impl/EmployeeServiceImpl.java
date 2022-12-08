package casestudy.services.impl;

import casestudy.model.people.Employee;
import casestudy.services.IEmployeeService;
import casestudy.utils.WriteAndReadFileEmployee;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class EmployeeServiceImpl implements IEmployeeService {


    WriteAndReadFileEmployee w = new WriteAndReadFileEmployee();

    @Override
    public void addNew() throws IOException {
        List<Employee> employeeList = w.readerEmployee();
        try {
            w.writeEmployee(employeeList);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }


    @Override
    public void newedit(Employee employee) {
        List<Employee> employeeList;
        try {
            employeeList = w.readerEmployee();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        for (Employee employee1 : employeeList) {
            if (employee.getIdEmployee().equals(employee1.getIdEmployee())) {
                employee1.setName(employee.getName());
                employee1.setDateOfBirth(employee.getDateOfBirth());
                employee1.setGender(employee.getGender());
                employee1.setId(employee.getId());
                employee1.setPhoneNumber(employee.getPhoneNumber());
                employee1.setEmail(employee.getEmail());
                employee1.setLevel(employee.getLevel());
                employee1.setRank(employee.getRank());
                employee1.setSalary(employee.getSalary());
                break;
            }
        }
        try {
            w.writeEmployee(employeeList);
        } catch (IOException ex) {
            throw new RuntimeException(ex);
        }
    }

    @Override
    public void deleteall(String idEmployee) {
        Employee deleteEmployee = null;
        List<Employee> employeeList = new ArrayList<>();
        try {
            employeeList = w.readerEmployee();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        for (Employee e : employeeList) {
            if (e.getIdEmployee() == idEmployee) {
                deleteEmployee = e ;
                break;
            }
            if (deleteEmployee== null) {
                System.out.println("không có nhân viên cần xóa : ");
            }
            employeeList.remove(deleteEmployee);

            try {
                w.writeEmployee(employeeList);
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        }
    }

    @Override
    public void displayAll() {
        try {
          List<Employee> list =  w.readerEmployee();
           for (Employee e : list) {
               System.out.println(e.toStringDisplay());
           }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }


}
