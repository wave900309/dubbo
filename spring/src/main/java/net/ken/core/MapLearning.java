package net.ken.core;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * Created by Yang, Haiqiang on 2018/11/12.
 */
public class MapLearning {
    public static void main(String[] args) {
        Map<String, String> m = new HashMap<>();
        String _1 = m.put("1", "yi");
        m.put("2", "er");
        m.put("3", "san");
        m.put("4", "si");
        Collection<String> s = m.values();
        System.out.println(s);
        _1 = m.put("1", "one");
        System.out.println(m.entrySet());
    }
}
