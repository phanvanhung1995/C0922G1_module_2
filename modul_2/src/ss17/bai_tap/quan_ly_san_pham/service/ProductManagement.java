package ss17.bai_tap.quan_ly_san_pham.service;

import ss17.bai_tap.quan_ly_san_pham.model.Product;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ProductManagement {
    public static File file = new File("src/ss17/bai_tap/quan_ly_san_pham/data/product.txt");

//    thêm sản phẩm mới :
    public void themSP(List<Product> list) {
        ObjectOutputStream objectOutputStream = null;
        FileOutputStream fileOutputStream = null;
        try {
            fileOutputStream = new FileOutputStream(file);
            objectOutputStream = new ObjectOutputStream(fileOutputStream);
            objectOutputStream.writeObject(list);
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            try {
                objectOutputStream.close();
                fileOutputStream.close();

            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }
//    hiển thị sản phẩm  :
    public List<Product> hienThiSP() {
        List<Product> list ;
        try {
            FileInputStream fileInputStream = new FileInputStream(file);
            ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
            list = (List<Product>) objectInputStream.readObject();
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
        return list;
    }

    public void timKiemSP(int maSP) {
        List<Product> list = hienThiSP();
        for (Product p : list) {
            if (maSP == p.getMaSP()) {
                System.out.println("sản phẩm cần tìm là  : " + p.toString());
            }
        }
    }
}
