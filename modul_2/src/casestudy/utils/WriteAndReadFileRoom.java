package casestudy.utils;

import casestudy.model.faccility.Room;
import casestudy.model.faccility.Villa;
import casestudy.views.RoomInput;

import java.io.*;
import java.util.*;

public class WriteAndReadFileRoom {

    File file = new File("src/casestudy/data/roomDATA.csv");

    public void writeFIle(Map<Room, Integer> mapRoom) throws IOException {

        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(file));
        Set<Room> setRoom = mapRoom.keySet();
        for (Room r : setRoom) {
            bufferedWriter.write(r.toString() + "," + mapRoom.get(r));
            bufferedWriter.newLine();
        }
        bufferedWriter.close();
    }


    public Map<Room,Integer> readFile() throws IOException {
       Map<Room,Integer> mapRoom = new LinkedHashMap<>();
        BufferedReader bufferedReader = new BufferedReader(new FileReader(file));
        String line = "";

        while (true) {
            line = bufferedReader.readLine();

            if (line == null) {
                break;
            }
            String[] str = line.split(",");
            String idRoom = str[0];
            String nameService = str[1];
            String area = str[2];
            String price = str[3];
            String numberOfPeopleMax = str[4];
            String typeService = str[5];
            String freeService = str[6];

            Room room = new Room(idRoom,nameService, area, price, numberOfPeopleMax, typeService, freeService);
            int count = 0 ;
            mapRoom.put(room, count);
        }
        return mapRoom;
    }
}
