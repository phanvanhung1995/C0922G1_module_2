package ss17.bai_tap.quan_ly_san_pham.controller;

import ss17.bai_tap.quan_ly_san_pham.model.Product;
import ss17.bai_tap.quan_ly_san_pham.service.IProductManagement;
import ss17.bai_tap.quan_ly_san_pham.service.Imp.ProductManagementImpl;

import java.io.IOException;
import java.util.List;

public class ProductController {
    IProductManagement productManagement = new ProductManagementImpl();

    public void themSP(List<Product> list) {
        try {
            this.productManagement.themSP(list);
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }

    public List<Product> hienThiSP() {
        try {
           return this.productManagement.hienThiSP();
        } catch (IOException e) {
            System.out.println(e.getMessage());
            return null;
        } catch (ClassNotFoundException e) {
            System.out.println(e.getMessage());
            return null;
        }
    }

    public void timKiemSP(int maSP) {
        try {
            this.productManagement.timKiemSP(maSP);
        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}
