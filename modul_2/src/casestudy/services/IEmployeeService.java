package casestudy.services;

import casestudy.model.people.Employee;

public interface IEmployeeService extends Iservice{
    void newedit(Employee employee);

    void deleteall(String idEmployee);

}
