package ss16.read_file_Object.view;

import ss16.read_file_Object.controller.ReadObject;
import ss16.read_file_Object.model.Country;

import java.util.List;

public class TestReadObject {
    public static void main(String[] args) {
        ReadObject readObject = new ReadObject() ;
       List<Country> list =readObject.list();
        for (Country c: list) {
            System.out.println(c);
        }
    }
}
