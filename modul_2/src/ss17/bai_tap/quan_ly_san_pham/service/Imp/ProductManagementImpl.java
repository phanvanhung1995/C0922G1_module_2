package ss17.bai_tap.quan_ly_san_pham.service.Imp;

import ss17.bai_tap.quan_ly_san_pham.model.Product;
import ss17.bai_tap.quan_ly_san_pham.service.IProductManagement;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ProductManagementImpl implements IProductManagement {
  private static File file = new File("src/ss17/bai_tap/quan_ly_san_pham/data/product.txt");

    //    thêm sản phẩm mới :
    public void themSP(List<Product> list) throws IOException {
        ObjectOutputStream objectOutputStream;
        FileOutputStream fileOutputStream;

        fileOutputStream = new FileOutputStream(file);
        objectOutputStream = new ObjectOutputStream(fileOutputStream);
        objectOutputStream.writeObject(list);
        objectOutputStream.close();
        fileOutputStream.close();
    }

    //    hiển thị sản phẩm  :
    public List<Product> hienThiSP() {
        List<Product> list = new ArrayList<>();
        FileInputStream fileInputStream = null;
        ObjectInputStream objectInputStream = null;
        try {
            fileInputStream = new FileInputStream(file);
            objectInputStream = new ObjectInputStream(fileInputStream);
            list = (List<Product>) objectInputStream.readObject();
        } catch (FileNotFoundException e) {
            System.out.println("không tìm thấy file chứa");
        } catch (IOException e) {
            System.out.println("file không chứa sản phẩm nào");
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        } finally {
            try {
                objectInputStream.close();
                fileInputStream.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
        return list;
    }

    public void timKiemSP(int maSP) throws IOException, ClassNotFoundException {
        String result = "";
        List<Product> list = hienThiSP();
        for (Product p : list) {
            if (maSP == p.getMaSP()) {
                result = "sản phẩm cần tìm là  : " + p.toString();
            } else {
                result = "không có sản phẩm trong file";
            }
        }
        System.out.println(result);
    }
}
