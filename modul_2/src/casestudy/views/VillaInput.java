package casestudy.views;

import casestudy.model.faccility.Villa;

import java.util.Scanner;

public class VillaInput {

    public Villa inputNewVilla() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("nhập tên dịch vụ : ");
        String nameService = scanner.nextLine();
        System.out.println("nhập diện tích villa : ");
        String area = scanner.nextLine();
        System.out.println("nhập chi phí thuê : ");
        String price = scanner.nextLine();
        System.out.println("nhập số người thuê tối đa : ");
        String numberOfPeopleMax = scanner.nextLine();
        System.out.println("nhập số kiểu thuê : ");
        String typeService = scanner.nextLine();
        System.out.println("nhập tiêu chuẩn phòng : ");
        String standardRoom = scanner.nextLine();
        System.out.println("nhập diện tích hồ bơi : ");
        String areaPool = scanner.nextLine();
        System.out.println("nhập số tầng : ");
        String floor = scanner.nextLine();
        return new Villa(nameService, area, price, numberOfPeopleMax, typeService, standardRoom,
                areaPool, floor);

    }
}
