package ss4.bai_tap.Fan;

public class ManipulationFan {
    public static void main(String[] args) {
        Fan fan1 = new Fan();
        System.out.println(fan1.toString());

        Fan fan2 = new Fan(3, "yellow", 10, true);
        System.out.println(fan2.toString());

        Fan fan3 = new Fan(2, "blue", 5, false);
        System.out.println(fan3.toString());
    }
}
