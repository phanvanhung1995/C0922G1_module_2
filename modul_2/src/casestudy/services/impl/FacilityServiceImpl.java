package casestudy.services.impl;

import casestudy.model.faccility.Facility;
import casestudy.model.faccility.Room;
import casestudy.model.faccility.Villa;
import casestudy.services.IFacilityService;
import casestudy.utils.WriteAndReadFileRoom;
import casestudy.utils.WriteAndReadFileVilla;
import com.sun.javafx.iio.gif.GIFImageLoaderFactory;

import java.io.IOException;
import java.util.Map;


public class FacilityServiceImpl implements IFacilityService {

//    private static Map<Facility,Integer> facilityMap = new LinkedHashMap<>();
    WriteAndReadFileVilla writeAndReadFileVilla = new WriteAndReadFileVilla();
    WriteAndReadFileRoom writeAndReadFileRoom = new WriteAndReadFileRoom();


    @Override
    public void Maintenance() {
    }

    @Override
    public void addFacility(Facility o, int count) throws IOException {
        if (o instanceof Villa) {
            Villa villa = (Villa) o;
            Map<Villa,Integer> facilityMap = writeAndReadFileVilla.readFile();
            // kiem tra su ton tai cua villa
            for (Map.Entry<Villa, Integer> entry : facilityMap.entrySet()) {
                if (entry.getKey().getIdVilla().equals(villa.getIdVilla())) {
                    // da ton tai
                    throw new IllegalArgumentException("Da ton tai");
                }
            }

            facilityMap.put(villa, 0);

            writeAndReadFileVilla.writeFIle(facilityMap);
        }

        if (o instanceof Room) {
            Room room = (Room) o ;
            Map<Room,Integer> facilitiMap = writeAndReadFileRoom.readFile();

            for (Map.Entry<Room,Integer> entry : facilitiMap.entrySet()) {
                if (entry.getKey().getIdRoom().equals(room.getIdRoom())) {
                    throw new  IllegalArgumentException("da ton tai") ;
                }
            }
            facilitiMap.put(room,0);
            writeAndReadFileRoom.writeFIle(facilitiMap);
        }
    }

    public void displayFacilityVilla() throws IOException {
        writeAndReadFileVilla.readFile() ;
    }
    public void displayFacilityRoom() throws IOException {
        writeAndReadFileRoom.readFile();
    }



}
