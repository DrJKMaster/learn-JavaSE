package j_internet.c_TCP.c_UDP;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

class UDP1 {
    public static void main(String[] args) throws IOException {
        //UDP 每个数据包的容量限制在 64KB 以内
        DatagramSocket socket = new DatagramSocket(9999);

        byte[] buf = new byte[1024];
        DatagramPacket packet1 = new DatagramPacket(buf, buf.length);
        socket.receive(packet1);
        int length = packet1.getLength();
        System.out.println(new String(packet1.getData(), 0, length));

        byte[] data = "hello,2".getBytes();
        DatagramPacket packet2 = new DatagramPacket(data, data.length, InetAddress.getLocalHost(), 8888);
        socket.send(packet2);

        socket.close();
    }
}
