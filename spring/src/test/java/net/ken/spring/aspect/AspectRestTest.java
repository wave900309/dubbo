package net.ken.spring.aspect;

import org.springframework.web.client.RestTemplate;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by Yang, Haiqiang on 2018/09/28.
 */
public class AspectRestTest {

    public static final String URL = "http://localhost:7777/aspect/log/?date={date}";

    public static void main(String[] args) {
        RestTemplate template = new RestTemplate();
        String res = template.getForObject(URL, String.class, new Date());
        System.out.println(res);
    }
}
