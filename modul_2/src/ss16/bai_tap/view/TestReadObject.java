package ss16.bai_tap.view;

import ss16.bai_tap.controller.ReadObject;
import ss16.bai_tap.model.Country;

import java.util.ArrayList;
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
