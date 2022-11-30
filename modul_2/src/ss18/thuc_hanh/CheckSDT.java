package ss18.thuc_hanh;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Pattern;

public class CheckSDT {
    private String result ;

    public String checkSDT(String sdt) {
        List<String> list = new ArrayList<>();

        Pattern p = Pattern.compile("^[0-9]{10}");

        if (p.matcher(sdt).find()) {
            System.out.println(sdt);
        }else {
            result = "sđt không đúng";
        }
        return sdt;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> list = new ArrayList<>();
        System.out.println("nhập sdt : ");
        String sdt = scanner.nextLine();
        CheckSDT checkSDT =new CheckSDT();
        checkSDT.checkSDT(sdt) ;
    }
}

