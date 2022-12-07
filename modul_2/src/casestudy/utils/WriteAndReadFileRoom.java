package casestudy.utils;

import casestudy.model.faccility.Room;
import casestudy.views.RoomInput;

import java.io.*;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class WriteAndReadFileRoom {

    File file = new File("src/casestudy/data/roomDATA.csv");

    public void writeFIle() throws IOException {
        Room roomInput = RoomInput.inputRoom();
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(file));
        bufferedWriter.write(String.valueOf(roomInput));
        bufferedWriter.newLine();
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
            System.out.println(room.toStringDisplay());
        }
        return mapRoom;
    }

    public static void main(String[] args) throws IOException {
        WriteAndReadFileRoom w = new WriteAndReadFileRoom();

        w.readFile();
    }
}
