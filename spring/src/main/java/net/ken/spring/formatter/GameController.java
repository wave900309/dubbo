package net.ken.spring.formatter;

import net.ken.spring.formatter.model.Desc;
import net.ken.spring.formatter.model.Game;
import net.ken.spring.formatter.model.Type;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

/**
 * Created by Yang, Haiqiang on 2018/09/04.
 */
@RestController
@RequestMapping("format")
public class GameController {

    @RequestMapping("/game")
    public String game(String gameName) {
        Game g = new Game();
        g.setName(gameName);
        g.setPublisher("Bandai Namco Entertainment");
        g.setScore(91D);
        g.setPrice(268D);
        g.setRelease(new Date());
        g.setType(Type.ARPG);
        g.setDeveloper("From Software");
        Desc desc = new Desc();
        desc.setDesc(g);
        System.out.println(desc.desc);
        return "success";
    }
}
