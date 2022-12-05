package casestudy.model.people;

import javax.xml.crypto.Data;

public class Employee extends People{

    private String idEmployee ;
    private String level ;
    private String rank ;
    private String salary ;



    public Employee(String name, String dateOfBirth, String gender, String id, String phoneNumber,
                    String email, String idEmployee, String level, String rank, String salary) {
        super(name, dateOfBirth, gender, id, phoneNumber, email);
        this.idEmployee = idEmployee;
        this.level = level;
        this.rank = rank;
        this.salary = salary;
    }

    public String getIdEmployee() {
        return idEmployee;
    }

    public void setIdEmployee(String idEmployee) {
        this.idEmployee = idEmployee;
    }

    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }

    public String getRank() {
        return rank;
    }

    public void setRank(String rank) {
        this.rank = rank;
    }

    public String getSalary() {
        return salary;
    }

    public void setSalary(String salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return  super.toString() + ","+
                 idEmployee + "," +
                 level + "," +
               rank + "," +
                 salary ;
    }
}
