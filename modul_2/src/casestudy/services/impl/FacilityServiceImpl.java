package casestudy.services.impl;

import casestudy.model.faccility.Facility;
import casestudy.services.IFacilityService;
import casestudy.utils.WriteAndReadFileVilla;

import java.io.File;
import java.io.IOException;
import java.util.LinkedHashMap;
import java.util.Map;


public class FacilityServiceImpl implements IFacilityService {

    private static Map<Facility,Integer> facilityMap = new LinkedHashMap<>();
    WriteAndReadFileVilla writeAndReadFileVilla = new WriteAndReadFileVilla();


    @Override
    public void Maintenance() {
    }

    @Override
    public void addFacility(Facility o, int count) {
        facilityMap.put(o,count);
    }

    public void displayFacilityVilla(File file) throws IOException {
        writeAndReadFileVilla.readFile(file) ;
    }
    public void displayFacilityRoom(File file) throws IOException {
        writeAndReadFileVilla.readFile(file) ;
    }



}
