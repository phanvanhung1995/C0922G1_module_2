package casestudy.utils;

import casestudy.model.faccility.Facility;
import casestudy.model.faccility.Villa;
import casestudy.views.VillaInput;

import java.io.*;
import java.util.*;

public class WriteAndReadFileVilla {
    private final File file = new File("src/casestudy/data/villaDATA.csv");

    public void writeFIle(Map<Villa, Integer> mapVilla) throws IOException {

        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(file));
        Set<Villa> setVilla = mapVilla.keySet();
        for (Villa f : setVilla) {
            bufferedWriter.write(f.toString() + "," + mapVilla.get(f));
            bufferedWriter.newLine();
        }
        bufferedWriter.close();
    }

    public Map<Villa, Integer> readFile() throws IOException {

        Map<Villa, Integer> villaMap = new LinkedHashMap<>();
        BufferedReader bufferedReader = new BufferedReader(new FileReader(file));
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

            Villa villa = new Villa(idVilla, nameService, area, price, numberOfPeopleMax, typeService,
                    standardRoom, areaPool, floor);
            int count = 0;
            villaMap.put(villa, count);
        }
        return villaMap;
    }

}
