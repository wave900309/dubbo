package net.ken.util;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by Yang, Haiqiang on 2018/05/21.
 */
public class R {
    public static void main(String[] args) {
        String s = "mobile\tcontent\n" + "13400001007\t您的手机验证码是100135，请及时输入！";
        Pattern p = Pattern.compile("您的手机验证码是(\\d+)");
        Matcher matcher = p.matcher(s);
        if(matcher.find())
            System.out.println(matcher.group(1));
    }
}
