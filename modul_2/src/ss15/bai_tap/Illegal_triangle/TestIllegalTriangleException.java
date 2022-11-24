package ss15.bai_tap.Illegal_triangle;

import java.util.Scanner;

public class TestIllegalTriangleException {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("nhập vào cạnh thứ nhất của tam giác : ");
        int a = Integer.parseInt(scanner.nextLine()) ;
        System.out.print("nhập vào cạnh thứ hai của tam giác : ");
        int b = Integer.parseInt(scanner.nextLine()) ;
        System.out.print("nhập vào cạnh thứ ba của tam giác : ");
        int c = Integer.parseInt(scanner.nextLine()) ;

        IllegalTriangleException ite = new IllegalTriangleException(a,b,c);
        try {
            ite.triangleException();
        } catch (Triangle e) {
            System.err.println(e.getMessage());
        }
    }
}
