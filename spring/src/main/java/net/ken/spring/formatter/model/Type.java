package net.ken.spring.formatter.model;

import org.apache.commons.lang3.StringUtils;

/**
 * Created by Yang, Haiqiang on 2018/09/04.
 */
public enum Type {
    RPG,
    ARPG,
    SRPG,
    ACT,
    RAC,
    FPS,
    TPS,
    SLG,
    RTS,
    PUZ;

    public static Type getType(String s){
        for (Type t: Type.values()){
            if (StringUtils.equals(s, t.name())){
                return t;
            }
        }
        return RPG;
    }
}
