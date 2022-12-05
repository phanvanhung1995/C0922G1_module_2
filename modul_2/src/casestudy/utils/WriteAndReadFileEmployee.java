package casestudy.utils;

import casestudy.model.people.Employee;
import casestudy.views.EmployeeInput;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class WriteAndReadFileEmployee {

    private File employeefile = new File("src/casestudy/data/employeeDATA.csv");

    public void writeEmployee() throws IOException {

        List<Employee> employeelist = new ArrayList<>();
        employeelist.add(EmployeeInput.inputEmployee());

        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(employeefile));
        bufferedWriter.write(employeelist.get(0).toString());
        bufferedWriter.newLine();
        bufferedWriter.close();
    }

    public List<Employee> readerEmployee() throws IOException {
        List<Employee> employeeList = new ArrayList<>();
        BufferedReader bufferedReader = new BufferedReader(new FileReader(employeefile));
        String line = "";

        while (true) {
            line = bufferedReader.readLine();
            if (line == null) {
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
            String level = str[7];
            String rank = str[8];
            String salary = str[9];

            Employee employee = new Employee(name, dateOfBirth, gender, id, phoneNumber, Email, idEmployee, level, rank, salary);
            employeeList.add(employee);
        }
        return employeeList;
    }

    public static void main(String[] args) throws IOException {
        WriteAndReadFileEmployee w = new WriteAndReadFileEmployee();
        w.writeEmployee();
    }

}
