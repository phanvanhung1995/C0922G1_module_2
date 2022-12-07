package casestudy.views;

import casestudy.libsx.Regex;
import casestudy.model.faccility.Room;

import java.util.Scanner;

public class RoomInput {
    public static Room inputRoom() {
        Scanner scanner = new Scanner(System.in);

        String regexIdRoom = "^SVVL-[0-9]{4}$";
        String err = "nhập sai mời nhập lại : ";
        String regexNameService = "^[A-Z]{1}$" ;
        String regexArea = "^0*[3-9]{1,}|[1-2][0-9]{2,}$";
        String regexPrice = "^[0-9]{1,}.[0-9]{1,}|[0-9]{1,}$" ;
        String regexNumberOfPeopleMax = "^[0-1]?[0-9]$$" ;

        System.out.println("nhập mã  dịch vụ : ");
        String idRoom = Regex.regexFacility(scanner.nextLine(),regexIdRoom, err);
        System.out.println("nhập tên dịch vụ : ");
        String nameService = Regex.regexFacility(scanner.nextLine(),regexNameService, err);
        System.out.println("nhập diện tích room : ");
        String area = Regex.regexFacility(scanner.nextLine(),regexArea, err);
        System.out.println("nhập chi phí thuê : ");
        String price = Regex.regexFacility(scanner.nextLine(),regexPrice, err);
        System.out.println("nhập số người thuê tối đa : ");
        String numberOfPeopleMax =Regex.regexFacility(scanner.nextLine(),regexNumberOfPeopleMax, err);
        System.out.println("nhập số kiểu thuê : ");
        String typeService = Regex.regexFacility(scanner.nextLine(),regexNameService, err);
        System.out.println("nhập tiêu chuẩn phòng : ");
        String freeService = Regex.regexFacility(scanner.nextLine(),regexNameService, err);

        return new Room(idRoom,nameService, area, price, numberOfPeopleMax, typeService, freeService);
    }
}
