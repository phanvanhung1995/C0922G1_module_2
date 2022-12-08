package casestudy.views;

import casestudy.libsx.Regex;
import casestudy.model.faccility.Villa;

import java.util.Scanner;

public class VillaInput {

    public static Villa inputNewVilla() {
        Scanner scanner = new Scanner(System.in);
        String regexIdVilla = "^SVVL-[0-9]{4}$";
        String err = "nhập sai mời nhập lại : ";
        String regexNameService = "^[A-Z]{1}[a-zA-Z0-9]{1,}$" ;
        String regexArea = "^0*[3-9]{1,}|[1-2][0-9]{2,}$";
        String regexPrice = "^[0-9]{1,}.[0-9]{1,}|[0-9]{1,}$" ;
        String regexNumberOfPeopleMax = "^[0-1]?[0-9]$$" ;
        String regexFloor = "^[1-9]{1,}" ;

        System.out.println("nhập mã dịch vụ : ");
        String idVilla = Regex.regexFacility(scanner.nextLine(),regexIdVilla, err);

        System.out.println("nhập tên dịch vụ : ");
        String nameService = Regex.regexFacility(scanner.nextLine(),regexNameService, err);
        System.out.println("nhập diện tích villa : ");
        String area = scanner.nextLine();
        System.out.println("nhập chi phí thuê : ");
        String price = Regex.regexFacility(scanner.nextLine(),regexPrice, err);
        System.out.println("nhập số người thuê tối đa : ");
        String numberOfPeopleMax =  Regex.regexFacility(scanner.nextLine(),regexNumberOfPeopleMax, err);
        System.out.println("nhập số kiểu thuê : ");
        String typeService = Regex.regexFacility(scanner.nextLine(),regexNameService, err);
        System.out.println("nhập tiêu chuẩn phòng : ");
        String standardRoom = Regex.regexFacility(scanner.nextLine(),regexNameService, err);
        System.out.println("nhập diện tích hồ bơi : ");
        String areaPool = Regex.regexFacility(scanner.nextLine(),regexArea, err);
        System.out.println("nhập số tầng : ");
        String floor =  Regex.regexFacility(scanner.nextLine(),regexFloor, err);
        return new Villa(idVilla, nameService, area, price, numberOfPeopleMax, typeService, standardRoom,
                areaPool, floor);
    }
}
