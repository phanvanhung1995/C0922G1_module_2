package ss17.bai_tap.quan_ly_san_pham.view;

import ss17.bai_tap.quan_ly_san_pham.controller.ProductController;
import ss17.bai_tap.quan_ly_san_pham.model.Product;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Productview {
    public static void productController() throws IOException {
        List<Product> list = new ArrayList<>();
        boolean check = true;

        ProductController productController = new ProductController();
        Scanner scanner = new Scanner(System.in);
        int luaChon;
        do {
            System.out.println("------------MENU-----------");
            System.out.println(" 1 - thêm sản phẩm : ");
            System.out.println(" 2 - hiển thị danh sách sản phẩm : ");
            System.out.println(" 3 - tìm kiếm sản phẩm theo id : ");
            System.out.println(" 0 - thoát chương trình ");
            System.out.print("chọn mục cần sử dụng dưới menu : ");
            luaChon = Integer.parseInt(scanner.nextLine());
            switch (luaChon) {
                case 1:
                    try {
                        System.out.print("nhập mã sản phẩm : ");
                        int maSP = Integer.parseInt(scanner.nextLine());
                        System.out.print("nhập tên Sản phẩm : ");
                        String tenSP = scanner.nextLine();
                        System.out.print("nhập hãng sản xuất : ");
                        String hangSX = scanner.nextLine();
                        System.out.print("nhập giá sản phẩm : ");
                        double giaSP = Double.parseDouble(scanner.nextLine());
                        System.out.print("nhập mô tả về sản phẩm này : ");
                        String moTa = scanner.nextLine();
                        Product product = new Product(maSP, tenSP, hangSX, giaSP, moTa);

                        for (Product p : list) {
                            if (p.getMaSP() == maSP) {
                                check = false ;
                            }
                        }
                        if (check == true) {
                            list.add(product);
                        }

                    } catch (NumberFormatException e) {
                        throw new RuntimeException(e);
                    }
                    productController.themSP(list);
                    break;
                case 2:
                    List<Product> list1;
                    list1 = productController.hienThiSP();
                    for (Product p : list1) {
                        System.out.println(p);
                    }
                    break;
                case 3:
                    System.out.println("nhập mã sản phầm : ");
                    int maSP = Integer.parseInt(scanner.nextLine());
                    productController.timKiemSP(maSP);
                    break;
                case 0:
                    break;
                default:
                    System.out.println("lựa chọn không đúng trong menu, vui lòng chọn lai :");
            }
        } while (luaChon != 0);

    }
}
