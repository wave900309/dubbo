package net.ken.core;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Yang, Haiqiang on 2018/11/13.
 */
public class HashMapLearning {

    public static void main(String[] args) {
        Map<String, String> hm = new HashMap<>(40);

        for (int i = 0; i < 100000; i++) {
            hm.put((Math.random() * 10000)+ "", "V" + i);
        }
        System.out.println(hm);
    }
}
