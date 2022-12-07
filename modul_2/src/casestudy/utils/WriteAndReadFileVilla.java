package casestudy.utils;

import casestudy.model.faccility.Facility;
import casestudy.model.faccility.Villa;
import casestudy.views.VillaInput;

import java.io.*;
import java.util.*;

public class WriteAndReadFileVilla {
    File file = new File("src/casestudy/data/villaDATA.csv");

    public void writeFIle(Facility f) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(file));
        bufferedWriter.write(String.valueOf(f));
        bufferedWriter.newLine();
        bufferedWriter.close();
    }

    public Map<Villa, Integer> readFile(File f) throws IOException {

        Map<Villa, Integer> villaMap = new LinkedHashMap<>();
        BufferedReader bufferedReader = new BufferedReader(new FileReader(f));
        String line = "";

        while (true) {
            line = bufferedReader.readLine();

            if (line == null) {
                break;
            }

            String[] str = line.split(",");
            String idVilla = str[0];
            String nameService = str[1];
            String area = str[2];
            String price = str[3];
            String numberOfPeopleMax = str[4];
            String typeService = str[5];
            String standardRoom = str[6];
            String areaPool = str[7];
            String floor = str[8];

            Villa villa = new Villa(idVilla,nameService, area, price, numberOfPeopleMax, typeService,
                    standardRoom, areaPool, floor);
            int count = 0 ;
            villaMap.put(villa, count);
            System.out.println(villa.toStringDisplay());
        }
        return villaMap;
    }
}
