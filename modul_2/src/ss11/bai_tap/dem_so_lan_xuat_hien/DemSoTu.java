package ss11.bai_tap.dem_so_lan_xuat_hien;

import java.util.*;

public class DemSoTu {
    public static void main(String[] args) {
         Map<String , Integer> duLieu = new TreeMap<>() ;
        Scanner sc = new Scanner(System.in) ;

        System.out.println("nhập đoạn văn bản ");
        String vanBan = sc.nextLine() ;

       String[] word =  vanBan.toUpperCase().split(" ") ;

       int count = 0;
        int size = word.length ;

        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size ; j++) {
                if (word[i].equals(word[j])) {
                    count++ ;
                }
            }
           duLieu.put(word[i],count);
            count = 0 ;
        }
        System.out.println(Collections.unmodifiableMap(duLieu));
    }
}
