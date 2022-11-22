package ss12.bai_tap.quan_ly_san_pham;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Objects;
import java.util.Scanner;

public class ProductManagerLinkedlist {
    LinkedList<Product> danhSach ;
    Scanner sc = new Scanner(System.in);

    public ProductManagerLinkedlist() {
        this.danhSach = new LinkedList<>() ;
    }

    public ProductManagerLinkedlist(LinkedList<Product> danhSach) {
        this.danhSach = danhSach;
    }
    public void themSP(Product sp) {
        this.danhSach.add(sp) ;
    }
    public void disPlay() {
        for (Product sanpham : danhSach) {
            System.out.println(sanpham.toString());
        }
    }

    public void suaSP() {

        System.out.print("nhập id muốn sửa : ");
        int id = Integer.parseInt(sc.nextLine()) ;
        for (Product sanpham : danhSach) {
            if (sanpham.getId() == id ) {
                System.out.print("nhập id mới ");
                int newID = Integer.parseInt(sc.nextLine()) ;
                System.out.print("nhập tên sp mới : ");
                String newName = sc.nextLine();
                System.out.print("nhập giá sản phẩm  mới : ");
                double newGia = Double.parseDouble(sc.nextLine()) ;
                sanpham.setId(newID) ;
                sanpham.setName(newName);
                sanpham.setGiaSP(newGia);
            } else {
                System.out.println(" không có sản phẩm trong danh sách");
            }
        }
    }

    public void xoaSP() {
        System.out.println("nhập id muốn xóa : ");
        int id = Integer.parseInt(sc.nextLine()) ;

        for (Product sanPham:danhSach) {
            if (id == sanPham.getId()) {
                danhSach.remove(sanPham);
                break;
            } else {
                System.out.println("không có sản phẩm trong danh sách ");
            }
        }
    }

    public void timKiemSP() {
        System.out.println("nhập vào tên sản phẩm muốn tìm kiếm ");
        String name  = sc.nextLine();
        for (Product sanpham: danhSach) {
            if (Objects.equals(name, sanpham.getName())) {
                System.out.println(sanpham.toString());
                break;
            }
        }

    }
    public void sapXepSPGiamDan() {
        comparator comparator = new comparator() ;
        danhSach.sort(comparator);
        System.out.println(danhSach);
    }
}
