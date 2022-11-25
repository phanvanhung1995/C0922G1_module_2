package ss16.read_file_Object.controller;

import ss16.read_file_Object.model.Country;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class WriteObject {
    public void write(List<Country> list) {
        File file = new File("src/ss16/bai_tap/data/country.csv");

        try {
            FileWriter fileWriter = new FileWriter(file) ;
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter) ;
            for (Country c: list) {
                bufferedWriter.write(c.toString());
                bufferedWriter.newLine();
            }
            bufferedWriter.close();
            fileWriter.close();

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
