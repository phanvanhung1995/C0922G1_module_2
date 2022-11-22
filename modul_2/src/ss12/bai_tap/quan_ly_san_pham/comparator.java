package ss12.bai_tap.quan_ly_san_pham;

import java.util.Comparator;

public class comparator implements Comparator<Product> {

    @Override
    public int compare(Product o1, Product o2) {
            if (o1.getGiaSP() > o2.getGiaSP()) {
                return 1;
            } else if (o1.getGiaSP()<o2.getGiaSP()) {
                return -1 ;
            } else {
                return 0;
            }
        }
}
