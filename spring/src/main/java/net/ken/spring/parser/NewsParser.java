package net.ken.spring.parser;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.springframework.stereotype.Service;

import java.io.IOException;

/**
 * Created by Yang, Haiqiang on 2018/08/16.
 */
@Service
public class NewsParser {

    public void parser() throws IOException {
        Document doc = Jsoup.connect("http://en.wikipedia.org/").get();

    }
}
