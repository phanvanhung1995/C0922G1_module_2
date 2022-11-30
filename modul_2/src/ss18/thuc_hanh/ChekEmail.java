package ss18.thuc_hanh;

import ss3.bai_tap.Main;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ChekEmail {
//    phanvanhung1224@gmail.com
    private  Pattern pattern;
    private Matcher matcher ;



    public List<String> ChekEmail(String email) {
        List<String> list = new ArrayList<>();
        Pattern p = Pattern.compile("^[A-Za-z0-9]{1,}@[a-zA-Z0-9]{1,}.[a-zA-Z]{1,}$") ;

        if (p.matcher(email).find()) {
            System.out.println(email);
            list.add(email);
        } else {
            System.out.println("email không đúng định dạng mời nhâ lại : ");
        }
        return list;
    }


    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        do {
            System.out.println("nhập email : ");
            String email = scanner.nextLine();
            ChekEmail chekEmail =new ChekEmail();
            chekEmail.ChekEmail(email);
        } while (true);
    }
}
