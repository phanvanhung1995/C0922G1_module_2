package giai_thuat;

public class HinhThoi {
    public static void main(String[] args) {
      int n = 5;
      int m = 1;
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j > 0; j--) {
                if (i==n) {
                    System.out.println(j);
                    n++;
                    break;
                }
            }
            for (int x = 0; x < 5; x++) {
                if (x==m) {
                    System.out.println(x);
                    m-- ;
                    break;
                } else {
                    System.out.println("--");
                }
            }
            System.out.println();
        }
    }
}
