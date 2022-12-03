package casestudy.model.people;

import javax.xml.crypto.Data;

public class Customer extends People{

    private String idCustomer;
    private String rankCustomer ;
    private String address;


    public Customer(String name, String dateOfBirth, String gender, String id, String phoneNumber, String email) {
        super(name, dateOfBirth, gender, id, phoneNumber, email);
    }

    public Customer(String name, String dateOfBirth, String gender, String id, String phoneNumber,
                    String email, String idCustomer, String rankCustomer, String address) {
        super(name, dateOfBirth, gender, id, phoneNumber, email);
        this.idCustomer = idCustomer;
        this.rankCustomer = rankCustomer;
        this.address = address;
    }

    public String getIdCustomer() {
        return idCustomer;
    }

    public void setIdCustomer(String idCustomer) {
        this.idCustomer = idCustomer;
    }

    public String getRankCustomer() {
        return rankCustomer;
    }

    public void setRankCustomer(String rankCustomer) {
        this.rankCustomer = rankCustomer;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "idCustomer='" + idCustomer + '\'' +
                ", rankCustomer='" + rankCustomer + '\'' +
                ", address='" + address + '\'' +
                "} " + super.toString();
    }
}
