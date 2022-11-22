package ss12.bai_tap.quan_ly_san_pham;


import java.util.Scanner;


public class Test {
    public static void main(String[] args) {

        int luaChon ;
        Scanner scanner = new Scanner(System.in) ;
        ProductManagerArraylist dssp = new ProductManagerArraylist();

        do {
            System.out.println("---------------Menu-----------");
            System.out.println("chọn chức năng dưới đây");
            System.out.println(" 1 - Thêm sản phẩm\n" +
                    " 2 - Sửa thông tin sản phẩm theo id\n" +
                    "3 - Xoá sản phẩm theo id\n" +
                    "4- Hiển thị danh sách sản phẩm\n" +
                    "5- Tìm kiếm sản phẩm theo tên\n" +
                    "6-  giảm dần theo giá\n"+
            "0- thoát khỏi chương trình\n");

            System.out.println("mời bạn nhập lựa chọn  : ");
            luaChon = Integer.parseInt(scanner.nextLine());
            switch (luaChon) {
                case 1 :
                    System.out.print("nhập id ");
                    int id = Integer.parseInt(scanner.nextLine()) ;
                    System.out.print("nhập tên sản phẩm ");
                    String name = scanner.nextLine() ;
                    System.out.print("nhập giá sản phẩm ");
                    double gia = Double.parseDouble(scanner.nextLine()) ;
                    Product sp = new Product(id, name, gia) ;
                    dssp.themSP(sp);
                    break;
                case 2:
                    dssp.suaSP();
                    break;
                case 3:
                    dssp.xoaSP();
                    break;
                case 4:
                    dssp.disPlay();
                    break;
                case 5:
                    dssp.timKiemSP();
                    break;
                case 6:
                    dssp.sapXepSPGiamDan();
                    break;
                default:
                    System.out.println(" nhập sai mời bạn nhập lại");
            }

        }while (luaChon !=0);
    }
}
