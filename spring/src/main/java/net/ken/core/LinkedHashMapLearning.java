package net.ken.core;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by Yang, Haiqiang on 2018/11/23.
 */
public class LinkedHashMapLearning {

    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(8, 30, 88, 61, 75, 10, 89, 87, 1);

        Map<Integer, String> map = new LinkedHashMap<>();
        for (Integer i: list){
            map.put(i, i + "");
        }
        System.out.println(map);
        map.put(61, "62");
        System.out.println(map);
    }
}
