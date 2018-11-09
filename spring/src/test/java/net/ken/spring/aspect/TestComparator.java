package net.ken.spring.aspect;

import java.util.Comparator;

/**
 * Created by Yang, Haiqiang on 2018/09/30.
 */

public class TestComparator implements Comparator<String> {
    @Override
    public int compare(String o1, String o2) {
        String s1 = o1.split(":")[1];
        String s2 = o2.split(":")[1];
        return s1.compareTo(s2);
    }
}
