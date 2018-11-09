package net.ken.nio.timeserver;


import net.ken.nio.server.Request;
import net.ken.nio.server.event.EventAdapter;

import java.util.Date;

/**
 * 日志记录
 */
public class LogHandler extends EventAdapter {
    public LogHandler() {
    }

    public void onClosed(Request request) throws Exception {
        String log = new Date().toString() + " from " + request.getAddress().toString();
        System.out.println(log);
    }

    public void onError(String error) {
        System.out.println("Error: " + error);
    }
}
