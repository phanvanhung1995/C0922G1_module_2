package casestudy.controllers;

import casestudy.model.faccility.Facility;
import casestudy.model.faccility.Room;
import casestudy.model.faccility.Villa;
import casestudy.services.impl.FacilityServiceImpl;
import casestudy.utils.WriteAndReadFileVilla;
import casestudy.views.RoomInput;
import casestudy.views.VillaInput;

import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class FacilityController {
    public static void displayFacility() throws IOException {

        int optionFacility;
        FacilityServiceImpl facilityService = new FacilityServiceImpl();
        do {
            System.out.println("-----MenuFacility -----");
            System.out.println("1\tDisplay list facility\n" +
                    "2\tAdd new facility\n" +
                    "3\tDisplay list facility maintenance\n" +
                    "4\tReturn main menu\n");

            Scanner scanner = new Scanner(System.in);
            System.out.println("nhập lựa chọn : ");
            optionFacility = scanner.nextInt();


            switch (optionFacility) {
                case 1:
                    int optionDisplay;

                    do {
                        System.out.println("----Menu----");
                        System.out.println("1.\tDisplay list Villa\n" +
                                "2.\tDisplay list Room\n" +
                                "3.\tBack to menu\n");
                        System.out.println("mời bạn chọn dịch vụ : ");
                        optionDisplay = scanner.nextInt();
                        switch (optionDisplay) {
                            case 1:
                                facilityService.displayFacilityVilla();
                                break;
                            case 2:
                                facilityService.displayFacilityRoom();
                                break;
                            case 3:
                                FacilityController.displayFacility();
                                break;
                            default:
                                System.out.println("không có trong menu, vui lòng chọn lại : ");
                        }
                    } while (optionDisplay != 0);
                case 2:
                    int optionAdd;
                    do {
                        System.out.println("----Menu----");
                        System.out.println("1.\tAdd New Villa\n" +
                                "2.\tAdd New Room\n" +
                                "3.\tBack to menu\n");
                        System.out.println("mời bạn chọn dịch vụ : ");
                        optionAdd = scanner.nextInt();

                        int countOfVilla = 0;
                        int countOfRoom = 0;
                        WriteAndReadFileVilla w = new WriteAndReadFileVilla();


                        switch (optionAdd) {
                            case 1:
                                Villa newVilla = VillaInput.inputNewVilla();
                                facilityService.addFacility(newVilla, countOfVilla);
                                break;
                            case 2:
                                Room newRoom = RoomInput.inputRoom();
                                facilityService.addFacility(newRoom, countOfRoom);
                                break;
                            case 3:
                                FacilityController.displayFacility();
                                break;
                            default:
                                System.out.println("không có trong menu, vui lòng chọn lại : ");
                        }
                    } while (optionAdd != 0);
                case 3:
                case 4:
                    FuramaController.displayMainMenu();
                    break;
                default:
                    System.out.println("Lựa chọn không có trong menu, vui lòng chọn lại : ");
            }
        } while (optionFacility != 0);
    }
}
