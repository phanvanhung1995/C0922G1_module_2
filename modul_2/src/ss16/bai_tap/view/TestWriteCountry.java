package ss16.bai_tap.view;

import ss16.bai_tap.controller.WriteObject;
import ss16.bai_tap.model.Country;

import java.util.ArrayList;
import java.util.List;

public class TestWriteCountry {
    public static void main(String[] args) {
       Country country1 = new Country(1,"AU","Australia");
       Country country2 = new Country(2,"CN","China");
       Country country3= new Country(3,"AU","Australia");
       Country country4= new Country(4,"CN","China");
       Country country5= new Country(5,"JP","Japan");
       Country country6= new Country(6,"CN","China");
       Country country7= new Country(7,"JP","Japan");
       Country country8= new Country(8,"TH","Thailand");

        List<Country> list = new ArrayList<>() ;
        list.add(country1);
        list.add(country2);
        list.add(country3);
        list.add(country4);
        list.add(country5);
        list.add(country6);
        list.add(country7);
        list.add(country8);

        WriteObject writeObject = new WriteObject() ;
        writeObject.write(list);
    }
}
