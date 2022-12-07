package casestudy.model.faccility;

import casestudy.model.faccility.Facility;

public class Room extends Facility {
    private String freeService;
    private String idRoom;



    public Room(String idRoom,String nameService, String area, String price, String numberOfPeopleMax,
                String typeService, String freeService) {
        super(nameService, area, price, numberOfPeopleMax, typeService);
        this.freeService = freeService;
        this.idRoom = idRoom;
    }

    public String getIdRoom() {
        return idRoom;
    }

    public void setIdRoom(String idRoom) {
        this.idRoom = idRoom;
    }

    public String getFreeService() {
        return freeService;
    }

    public void setFreeService(String freeService) {
        this.freeService = freeService;
    }

    @Override
    public String toString() {
        return super.toString() + "," +
                idRoom+ "," +
                 freeService ;
    }


    public String toStringDisplay() {
        return super.toStringDisplay() +
                "idRoom" + idRoom +
                "freeService='" + freeService + '\'' +
                "} " ;
    }
}
