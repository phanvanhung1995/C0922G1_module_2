package casestudy.services;

import casestudy.model.people.Employee;

public interface IEmployeeService extends Iservice{
    void editNew(Employee employee);

    void deleteAll(String idEmployee);

}
