package j_internet.c_TCP.b_TCP.a_chat;

import java.io.*;
import java.net.InetAddress;
import java.net.Socket;

class Client {
    public static void main(String[] args) throws IOException {
        //创建 Socket，连接到本机端口9999
        Socket socket = new Socket(InetAddress.getLocalHost(), 9999);
        //向服务器发送消息
        OutputStream outputStream = socket.getOutputStream();
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(outputStream));
        writer.write("hello,server");
        writer.flush();
        socket.shutdownOutput();//结束标记
        //接收消息并打印
        InputStream inputStream = socket.getInputStream();
        BufferedReader reader = new BufferedReader(new InputStreamReader(inputStream));
        System.out.println(reader.readLine());
        //关闭资源
        reader.close();
        writer.close();
        socket.close();
    }
}
