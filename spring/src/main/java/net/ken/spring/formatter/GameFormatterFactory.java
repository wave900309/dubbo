package net.ken.spring.formatter;

import org.springframework.format.AnnotationFormatterFactory;
import org.springframework.format.Parser;
import org.springframework.format.Printer;
import org.springframework.lang.Nullable;
import org.springframework.stereotype.Component;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by Yang, Haiqiang on 2018/09/04.
 */
@Component
public class GameFormatterFactory implements AnnotationFormatterFactory<GameFormat> {
    @Override
    @Nullable
    public Set<Class<?>> getFieldTypes() {
        Set<Class<?>> set = new HashSet<>();
        set.add(String.class);
        return set;
    }

    @Override
    @Nullable
    public Printer<?> getPrinter(@Nullable GameFormat annotation, @Nullable Class<?> fieldType) {
        return new GameFormatter();
    }

    @Override
    @Nullable
    public Parser<?> getParser(@Nullable GameFormat annotation, @Nullable Class<?> fieldType) {
        return new GameFormatter();
    }
}
