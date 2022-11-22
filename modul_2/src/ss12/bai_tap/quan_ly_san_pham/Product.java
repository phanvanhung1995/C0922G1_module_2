package ss12.bai_tap.quan_ly_san_pham;


public class Product {
    private int id;
    private String name;
    private double giaSP;

    public Product(int id, String name, double giaSP) {
        this.id = id;
        this.name = name;
        this.giaSP = giaSP;
    }

    public Product() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getGiaSP() {
        return giaSP;
    }

    public void setGiaSP(double giaSP) {
        this.giaSP = giaSP;
    }

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", giaSP=" + giaSP +
                '}';
    }
}
