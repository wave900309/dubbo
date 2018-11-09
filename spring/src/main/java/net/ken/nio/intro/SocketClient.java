package net.ken.nio.intro;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.InetSocketAddress;
import java.net.Socket;

/**
 * Created by Yang, Haiqiang on 2018/10/16.
 */
public class SocketClient {

    public static void main(String[] args) throws IOException {
        Socket socket = new Socket("localhost", 8080);
        OutputStream os = socket.getOutputStream();
        os.write("7777".getBytes("utf-8"));
        InputStream is = socket.getInputStream();
        byte[] bytes = new byte[12];
        is.read(bytes);
        socket.close();
        System.out.println(new String(bytes));
    }
}
