package ss1.thuc_hanh;

import javafx.scene.transform.Scale;

import java.util.Scanner;

public class Operator {
    public static void main(String[] args) {
        float width ;
        float height ;
        Scanner scanner = new Scanner(System.in) ;
        System.out.println("nhập width");
        width = scanner.nextFloat();
        System.out.println("nhập height");
        height = scanner.nextFloat() ;
        float Area = width * height ;
        System.out.println("Area = " + Area);
    }
}
