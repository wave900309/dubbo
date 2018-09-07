package net.ken.spring.formatter.model;

import net.ken.spring.formatter.GameFormat;

/**
 * Created by Yang, Haiqiang on 2018/09/04.
 */
public class Desc {

    @GameFormat
    public Game desc;

    @GameFormat
    public Game getDesc() {
        return desc;
    }

    public void setDesc(Game desc) {
        this.desc = desc;
    }
}
