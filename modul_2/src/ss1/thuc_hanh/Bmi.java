package ss1.thuc_hanh;

import com.sun.prism.PresentableState;

import java.util.Scanner;

public class Bmi {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double wight, height, bmi;

        System.out.println("your wight");
        wight = scanner.nextFloat();
        System.out.println("your height");
        height = scanner.nextFloat();
        bmi = wight / (height * height);
        String result = "";
        if (bmi < 18.5) {
            result = "underweight";
        } else if (bmi < 25) {
            result = "Normal";
        } else if (bmi < 30) {
            result = "Overweight";
        } else {
            result = " Obese ";
        }
        System.out.println(bmi);
        System.out.println(result);
    }
}
