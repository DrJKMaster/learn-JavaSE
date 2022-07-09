package j_internet.c_TCP.c_UDP;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

class UDP2 {
    public static void main(String[] args) throws IOException {
        DatagramSocket socket = new DatagramSocket(8888);

        byte[] data = "hello,1".getBytes();
        DatagramPacket packet1 = new DatagramPacket(data, data.length, InetAddress.getLocalHost(), 9999);
        socket.send(packet1);

        byte[] buf = new byte[1024];
        DatagramPacket packet2 = new DatagramPacket(buf, buf.length);
        socket.receive(packet2);
        int length = packet2.getLength();
        System.out.println(new String(packet2.getData(), 0, length));
        //System.out.println(new String(buf, 0, length)); //等价

        socket.close();
    }
}
