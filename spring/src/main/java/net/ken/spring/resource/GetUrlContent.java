package net.ken.spring.resource;

import org.springframework.core.io.UrlResource;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.MalformedURLException;

/**
 * Created by Yang, Haiqiang on 2018/08/27.
 */
public class GetUrlContent {

    public static void main(String[] args) throws IOException {
        UrlResource resource = new UrlResource("https://www.cnbeta.com");
        BufferedReader reader = new BufferedReader(new InputStreamReader(resource.getInputStream()));
        String line;
        while ((line = reader.readLine()) != null){
            System.out.println(line);
        }
    }
}
