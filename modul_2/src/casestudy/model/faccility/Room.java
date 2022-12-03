package casestudy.model.faccility;

import casestudy.model.faccility.Facility;

public class Room extends Facility {
    private String freeService;

    public Room(String nameService, int area, double price, int numberofpeoplemax, int typeService, String freeService) {
        super(nameService, area, price, numberofpeoplemax, typeService);
        this.freeService = freeService;
    }

    public Room(String nameService, int area, double price, int numberofpeoplemax, int typeService) {
        super(nameService, area, price, numberofpeoplemax, typeService);
    }

    public String getFreeService() {
        return freeService;
    }

    public void setFreeService(String freeService) {
        this.freeService = freeService;
    }

    @Override
    public String toString() {
        return "Room{" +
                "freeService='" + freeService + '\'' +
                "} " + super.toString();
    }
}
