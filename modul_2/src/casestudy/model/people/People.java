package casestudy.model.people;

import javax.xml.crypto.Data;
import java.util.Date;

public abstract class People {
    private String name;
    private String dateOfBirth;
    private String gender;
    private String id;
    private String phoneNumber;
    private String Email;

    public People(String name, String dateOfBirth, String gender, String id, String phoneNumber, String email) {
        this.name = name;
        this.dateOfBirth = dateOfBirth;
        this.gender = gender;
        this.id = id;
        this.phoneNumber = phoneNumber;
        Email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDateOfBirth() {
        return (String) dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = (String) dateOfBirth;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String email) {
        Email = email;
    }

    @Override
    public String toString() {
        return
                name + "," +
                        dateOfBirth + "," +
                        gender + "," +
                        id + "," +
                        phoneNumber + "," +
                        Email;

    }
}
