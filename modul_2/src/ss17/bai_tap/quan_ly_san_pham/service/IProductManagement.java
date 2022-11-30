package ss17.bai_tap.quan_ly_san_pham.service;

import ss17.bai_tap.quan_ly_san_pham.model.Product;

import java.io.IOException;
import java.util.List;

public interface IProductManagement {
    void addProduct(List<Product> list) throws IOException;

    List<Product> displayProduct()  throws IOException, ClassNotFoundException;

    void seachProduct(int maSP) throws IOException, ClassNotFoundException;
}
