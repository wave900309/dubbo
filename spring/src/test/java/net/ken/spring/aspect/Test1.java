package net.ken.spring.aspect;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * Created by Yang, Haiqiang on 2018/09/30.
 */
public class Test1 {

    public static void main(String[] args) {
        String result = "109:1537606828607, 7:1537606828614, 122:1537606828736, 51:1537606828787, 116:1537606828903, 29:1537606828932, 28:1537606828961, 24:1537606828985, 148:1537606829133, 8:1537606829142, 35:1537606829177, 148:1537606829326, 3:1537606829329, 31:1537606829360, 3:1537606829363, 2:1537606829365, 3:1537606829368, 160:1537606829528, 47:1537606829576, 146:1537606829722, 47:1537606829769, 165:1537606829934";
        List<String> list = Arrays.asList(result.split(","));
        System.out.println(list.size());
        list.sort(new TestComparator());
        System.out.println(list.toString());
    }
}
