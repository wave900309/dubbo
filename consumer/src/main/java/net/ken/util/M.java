package net.ken.util;

import java.security.SecureRandom;

/**
 * Created by Yang, Haiqiang on 2018/05/21.
 */
public class M {
    private static double t = 0;
    private static double f = 0;
    private static final double FACTOR = 0.98888D;

    private static String s = "[{\"time\": \"0\", \"val\": 1}]";

    public static void main(String[] args) {
        SecureRandom generater = new SecureRandom();
        System.out.println(generater.nextInt(37));
    }

}
