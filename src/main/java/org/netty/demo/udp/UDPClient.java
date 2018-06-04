package org.netty.demo.udp;

import java.io.IOException;
import java.net.*;

/**
 * Created by XiuYin.Cui on 2018/6/4.
 */
public class UDPClient {

    public static void main(String[] args) {
        try {
            DatagramSocket client = new DatagramSocket();
            //创建数据报
            byte[] buffer = "hello,world".getBytes();
            InetAddress byName = InetAddress.getByName("192.168.1.22");
            DatagramPacket datagramPacket = new DatagramPacket(buffer, buffer.length, byName, 8088);
            client.send(datagramPacket);
        } catch (SocketException e) {
            e.printStackTrace();
        } catch (UnknownHostException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
