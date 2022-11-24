package ss15.bai_tap.Illegal_triangle;

public class Triangle extends Exception {
    String result ;

    public Triangle(){

    }
    @Override
    public String getMessage() {
        return result = "nhập dữ liệu bị sai";
    }
}
