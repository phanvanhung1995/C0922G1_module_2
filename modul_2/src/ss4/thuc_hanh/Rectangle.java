package ss4.thuc_hanh;

import java.util.Scanner;

public class Rectangle {
    double width, height;
    public Rectangle() {
    }

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    public double getArea() {
        return this.height * this.width;
    }

    public double getPerimeter() {
        return (this.width + this.height) * 2;
    }

    public String display() {
        return "Rectangle có width = " + width + "và height = " + height;
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("nhập vào width");
        double width = sc.nextDouble();
        System.out.println("nhập vào height");
        double height = sc.nextDouble();

        Rectangle rec = new Rectangle(width, height);

        System.out.println(rec.getArea());
        System.out.println(rec.getPerimeter());
        System.out.println(rec.display());
    }
}

