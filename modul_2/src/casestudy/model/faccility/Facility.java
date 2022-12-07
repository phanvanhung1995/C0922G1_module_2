package casestudy.model.faccility;

public abstract class Facility {
    private String nameService;
    private String area;
    private String price;
    private String numberOfPeopleMax;
    private String typeService;

    public Facility(String nameService, String area, String price, String numberOfPeopleMax, String typeService) {
        this.nameService = nameService;
        this.area = area;
        this.price = price;
        this.numberOfPeopleMax = numberOfPeopleMax;
        this.typeService = typeService;
    }

    public String getNameService() {
        return nameService;
    }

    public void setNameService(String nameService) {
        this.nameService = nameService;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getNumberOfPeopleMax() {
        return numberOfPeopleMax;
    }

    public void setNumberOfPeopleMax(String numberOfPeopleMax) {
        this.numberOfPeopleMax = numberOfPeopleMax;
    }

    public String getTypeService() {
        return typeService;
    }

    public void setTypeService(String typeService) {
        this.typeService = typeService;
    }

    @Override
    public String toString() {
        return
                 nameService + "," +
                 area + "," +
                price + "," +
                 numberOfPeopleMax + "," +
                 typeService
                ;
    }

    public String toStringDisplay() {
        return "Facility{" +
                "nameService='" + nameService + '\'' +
                ", area='" + area + '\'' +
                ", price='" + price + '\'' +
                ", numberOfPeopleMax='" + numberOfPeopleMax + '\'' +
                ", typeService='" + typeService + '\''
                ;
    }
}
