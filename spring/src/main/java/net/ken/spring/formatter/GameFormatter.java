package net.ken.spring.formatter;

import net.ken.spring.formatter.model.Game;
import net.ken.spring.formatter.model.Type;
import org.springframework.format.Formatter;
import org.springframework.lang.Nullable;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Locale;

/**
 * Created by Yang, Haiqiang on 2018/09/04.
 */
public class GameFormatter implements Formatter<Game> {

    private final static String DESC =
            "%s, develop by %s, released at %s by %s, a very nice %s game have the score " + "at %s rank by players";

    @Override
    @Nullable
    public Game parse(@Nullable String text, @Nullable Locale locale) throws ParseException {
        if (text == null) {
            return null;
        }
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd");
        String[] filed = text.split(",");
        Game g = new Game();
        g.setName(filed[0]);
        g.setType(Type.getType(filed[1]));
        g.setRelease(sdf.parse(filed[2]));
        g.setPrice(Double.valueOf(filed[3]));
        g.setScore(Double.valueOf(filed[4]));
        g.setDeveloper(filed[5]);
        g.setPublisher(filed[6]);
        return g;
    }

    @Override
    @Nullable
    public String print(@Nullable Game object, @Nullable Locale locale) {
        if (object == null){
            return null;
        }
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd");
        return String.format(DESC, object.getName(), object.getDeveloper(), sdf.format(object.getRelease()),
                object.getPublisher(), object.getType(), object.getScore());
    }
}
