package ss17.bai_tap.quan_ly_san_pham.service;

import ss17.bai_tap.quan_ly_san_pham.model.Product;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;

public interface IProductManagement {
    void themSP(List<Product> list) throws IOException;

    List<Product> hienThiSP()  throws IOException, ClassNotFoundException;

    void timKiemSP(int maSP) throws IOException, ClassNotFoundException;
}
