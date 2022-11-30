package ss17.bai_tap.quan_ly_san_pham.model;

import java.io.Serializable;

public class Product implements Serializable {
    private int maSP;
    private String tenSP;
    private String hangSX;
    private double giaSP;
   private String moTa;

    public Product() {
    }

    public Product(int maSP, String tenSP, String hangSX, double giaSP, String moTa) {
        this.maSP = maSP;
        this.tenSP = tenSP;
        this.hangSX = hangSX;
        this.giaSP = giaSP;
        this.moTa = moTa;
    }

    public int getMaSP() {
        return maSP;
    }

    public void setMaSP(int maSP) {
        this.maSP = maSP;
    }

    public String getTenSP() {
        return tenSP;
    }

    public void setTenSP(String tenSP) {
        this.tenSP = tenSP;
    }

    public String getHangSX() {
        return hangSX;
    }

    public void setHangSX(String hangSX) {
        this.hangSX = hangSX;
    }

    public double getGiaSP() {
        return giaSP;
    }

    public void setGiaSP(double giaSP) {
        this.giaSP = giaSP;
    }

    public String getMoTa() {
        return moTa;
    }

    public void setMoTa(String moTa) {
        this.moTa = moTa;
    }

    @Override
    public String toString() {
        return "Product{" +
                "maSP=" + maSP +
                ", tenSP='" + tenSP + '\'' +
                ", hangSX='" + hangSX + '\'' +
                ", giaSP=" + giaSP +
                ", moTa='" + moTa + '\'' +
                '}';
    }
}
