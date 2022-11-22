package ss12.thuc_hanh.luu_danh_sach_sinh_vien;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class TestMap {
    public static void main(String[] args) {
        Map<String, Integer> hasmap = new HashMap<>() ;

        hasmap.put("hung", 28) ;
        hasmap.put("hau", 18) ;
        hasmap.put("vu", 27) ;
        hasmap.put("quynh", 30) ;

        System.out.println("hasmap = " + hasmap );

        Map<String, Integer> treeMap = new TreeMap<>(hasmap) ;
        System.out.println(treeMap);

        Map<String, Integer> linkedhasmap = new LinkedHashMap<>() ;

        linkedhasmap.put("hung", 28) ;
        linkedhasmap.put("hau", 18) ;
        linkedhasmap.put("vu", 27) ;
        linkedhasmap.put("quynh", 30) ;

        System.out.println(linkedhasmap);

    }
}
