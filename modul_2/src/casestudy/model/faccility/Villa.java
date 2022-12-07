package casestudy.model.faccility;

import casestudy.model.faccility.Facility;

public class Villa extends Facility {

    private String standardRoom;
    private String areaPool;
    private String floor;
    private String idVilla;



    public Villa(String idVilla,String nameService, String area, String price, String numberOfPeopleMax, String typeService,
                 String standardRoom, String areaPool, String floor) {
        super(nameService, area, price, numberOfPeopleMax, typeService);
        this.standardRoom = standardRoom;
        this.areaPool = areaPool;
        this.floor = floor;
        this.idVilla = idVilla;
    }

    public String getIdVilla() {
        return idVilla;
    }

    public void setIdVilla(String idVilla) {
        this.idVilla = idVilla;
    }

    public String getStandardRoom() {
        return standardRoom;
    }

    public void setStandardRoom(String standardRoom) {
        this.standardRoom = standardRoom;
    }

    public String getAreaPool() {
        return areaPool;
    }

    public void setAreaPool(String areaPool) {
        this.areaPool = areaPool;
    }

    public String getFloor() {
        return floor;
    }

    public void setFloor(String floor) {
        this.floor = floor;
    }

    @Override
    public String toString() {
        return super.toString()+ ","+
                idVilla + "," +
                standardRoom + "," +
                areaPool + "," +
                 floor ;
    }


    public String toStringDisplay() {
        return super.toStringDisplay() +
                ",idVilla = " + idVilla +'\'' +
                ",standardRoom='" + standardRoom + '\'' +
                ", areaPool='" + areaPool + '\'' +
                ", floor='" + floor + '\'' +
                "} ";
    }
}
