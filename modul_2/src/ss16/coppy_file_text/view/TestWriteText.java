package ss16.coppy_file_text.view;

import ss16.coppy_file_text.controlleer.WriteText;

import java.util.Scanner;

public class TestWriteText {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        System.out.println("nhập số phần tử muốn ghi vào : ");
        int size = Integer.parseInt(scanner.nextLine());
        String[] arrNumber= new String[size] ;

        for (int i = 0; i < size; i++) {
            System.out.println("nhập phần tử thứ " + (i+1) + "của mảng");
            arrNumber[i] = scanner.nextLine() ;
        }
        WriteText writeText = new WriteText() ;
        writeText.wriText(arrNumber);
    }
}
