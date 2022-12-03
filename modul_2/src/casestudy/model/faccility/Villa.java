package casestudy.model.faccility;

import casestudy.model.faccility.Facility;

public class Villa extends Facility {

    private String standardRoom;
    private double areaPool;
    private int floor;


    public String getStandardRoom() {
        return standardRoom;
    }

    public void setStandardRoom(String standardRoom) {
        this.standardRoom = standardRoom;
    }

    public double getAreaPool() {
        return areaPool;
    }

    public void setAreaPool(double areaPool) {
        this.areaPool = areaPool;
    }

    public int getFloor() {
        return floor;
    }

    public void setFloor(int floor) {
        this.floor = floor;
    }

    public Villa(String nameService, int area, double price, int numberofpeoplemax,
                 int typeService, String standardRoom, double areaPool, int floor) {
        super(nameService, area, price, numberofpeoplemax, typeService);
        this.standardRoom = standardRoom;
        this.areaPool = areaPool;
        this.floor = floor;
    }

    public Villa(String nameService, int area, double price, int numberofpeoplemax, int typeService) {
        super(nameService, area, price, numberofpeoplemax, typeService);
    }

    @Override
    public String toString() {
        return "Villa{" +
                "standardRoom='" + standardRoom + '\'' +
                ", areaPool=" + areaPool +
                ", floor=" + floor +
                "} " + super.toString();
    }
}
