package ss1.bai_tap;

import java.util.Scanner;

public class NumberAndString {
    public static void main(String[] args) {
        int number;
        Scanner scanner = new Scanner(System.in);
        System.out.println("input number to read");
        number = scanner.nextInt();
        String result = "";
        if (number < 10) {
            switch (number) {
                case 0:
                    result = "không";
                    break;
                case 1:
                    result = "một";
                    break;
                case 2:
                    result = "hai";
                    break;
                case 3:
                    result = "ba";
                    break;
                case 4:
                    result = "bốn";
                    break;
                case 5:
                    result = "nam";
                    break;
                case 6:
                    result = "sáu";
                    break;
                case 7:
                    result = "bảy";
                    break;
                case 8:
                    result = "Tám";
                    break;
                case 9:
                    result = "chín";
                    break;
            }
            System.out.println(result);
        } else if ( number < 20) {
            int number1 = number -10 ;
            switch (number1) {
                case 0:
                    result = "mười " + "";
                    break;
                case 1:
                    result = "mười " +"một";
                    break;
                case 2:
                    result = "mười " +"hai";
                    break;
                case 3:
                    result = "mười " +"ba";
                    break;
                case 4:
                    result = "mười " +"bốn";
                    break;
                case 5:
                    result = "mười " +"nam";
                    break;
                case 6:
                    result = "mười " +"sáu";
                    break;
                case 7:
                    result = "mười " +"bảy";
                    break;
                case 8:
                    result = "mười " +"Tám";
                    break;
                case 9:
                    result = "mười " +"chín";
                    break;
            }
            System.out.println(result);
        } else if (number<100) {
            int tens = number /10 ;
            int oans = number % 10 ;
           switch (tens) {
               case 2:
                   result = "hai mươi";
                   break;
               case 3:
                   result = "ba mươi";
                   break;
               case 4:
                   result = "bốn mươi";
                   break;
               case 5:
                   result = "nam mươi";
                   break;
               case 6:
                   result = "sáu mươi";
                   break;
               case 7:
                   result = "bảy mươi";
                   break;
               case 8:
                   result = "Tám mươi";
                   break;
               case 9:
                   result = "chín mươi";
                   break;
           }
            System.out.print(result + " ");
           switch (oans) {
               case 1:
                   result = "một";
                   break;
               case 2:
                   result = "hai";
                   break;
               case 3:
                   result = "ba";
                   break;
               case 4:
                   result = "bốn";
                   break;
               case 5:
                   result = "nam";
                   break;
               case 6:
                   result = "sáu";
                   break;
               case 7:
                   result = "bảy";
                   break;
               case 8:
                   result = "Tám";
                   break;
               case 9:
                   result = "chín";
                   break;
           }
            System.out.println(result);
        } else if (number< 1000) {
            int hundred = number / 100 ;
            int ten = number %100 ;
            switch (hundred) {
                case 1:
                    result = "một trăm";
                    break;
                case 2:
                    result = "hai trăm";
                    break;
                case 3:
                    result = "ba trăm";
                    break;
                case 4:
                    result = "bốn trăm";
                    break;
                case 5:
                    result = "nam trăm";
                    break;
                case 6:
                    result = "sáu trăm";
                    break;
                case 7:
                    result = "bảy trăm";
                    break;
                case 8:
                    result = "Tám trăm";
                    break;
                case 9:
                    result = "chín trăm";
                    break;
            }
            System.out.print(result + " ");
            if (ten<100) {
                int tens = ten /10 ;
                int oans = ten % 10 ;
                switch (tens) {
                    case 2:
                        result = "hai mươi";
                        break;
                    case 3:
                        result = "ba mươi";
                        break;
                    case 4:
                        result = "bốn mươi";
                        break;
                    case 5:
                        result = "nam mươi";
                        break;
                    case 6:
                        result = "sáu mươi";
                        break;
                    case 7:
                        result = "bảy mươi";
                        break;
                    case 8:
                        result = "Tám mươi";
                        break;
                    case 9:
                        result = "chín mươi";
                        break;
                }
                System.out.print(result + " ");
                switch (oans) {
                    case 1:
                        result = "một";
                        break;
                    case 2:
                        result = "hai";
                        break;
                    case 3:
                        result = "ba";
                        break;
                    case 4:
                        result = "bốn";
                        break;
                    case 5:
                        result = "nam";
                        break;
                    case 6:
                        result = "sáu";
                        break;
                    case 7:
                        result = "bảy";
                        break;
                    case 8:
                        result = "Tám";
                        break;
                    case 9:
                        result = "chín";
                        break;
                }
                System.out.println(result);
            }
        }
    }
}