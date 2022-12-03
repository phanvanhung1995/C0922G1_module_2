package casestudy.model.faccility;

public abstract class Facility {
    private String nameService;
    private int area;
    private double price;
    private int numberOfPeopleMax;
    private int typeService;

    public Facility(String nameService, int area, double price, int numberofpeoplemax, int typeService) {
        this.nameService = nameService;
        this.area = area;
        this.price = price;
        this.numberOfPeopleMax = numberofpeoplemax;
        this.typeService = typeService;
    }

    public String getNameService() {
        return nameService;
    }

    public void setNameService(String nameService) {
        this.nameService = nameService;
    }

    public int getArea() {
        return area;
    }

    public void setArea(int area) {
        this.area = area;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getNumberOfPeopleMax() {
        return numberOfPeopleMax;
    }

    public void setNumberOfPeopleMax(int numberOfPeopleMax) {
        this.numberOfPeopleMax = numberOfPeopleMax;
    }

    public int getTypeService() {
        return typeService;
    }

    public void setTypeService(int typeService) {
        this.typeService = typeService;
    }

    @Override
    public String toString() {
        return "Facility{" +
                "nameService='" + nameService + '\'' +
                ", area=" + area +
                ", price=" + price +
                ", numberOfPeopleMax=" + numberOfPeopleMax +
                ", typeService=" + typeService +
                '}';
    }
}
