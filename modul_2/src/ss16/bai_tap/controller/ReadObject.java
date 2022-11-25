package ss16.bai_tap.controller;

import ss16.bai_tap.model.Country;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ReadObject {

    public List<Country> list() {
        List list = new ArrayList();

        File file = new File("src/ss16/bai_tap/data/country.csv") ;
        try {
            FileReader fileReader = new FileReader(file);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String line = "";

            while (true) {
                line = bufferedReader.readLine();

                if (line == null) {
                    break;
                }
                String[] str = line.split(",");
                int id = Integer.parseInt(str[0]);
                String code = str[1];
                String name = str[2];

                Country country = new Country(id,code,name);
                list.add(country);
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return list;
    }
}
