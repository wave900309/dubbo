package net.ken.core;

        import java.util.Arrays;
        import java.util.List;
        import java.util.Map;
        import java.util.Stack;
        import java.util.TreeMap;

/**
 * Created by Yang, Haiqiang on 2018/11/16.
 */
public class TreeMapLearning {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(23, 45, 9, 15, 39, 23, 51, 92, 36);
        Map<Integer, Integer> map = new TreeMap<>();
        for (Integer i : list) {
            map.put(i, i);
            System.out.println(map);
        }

    }
}
