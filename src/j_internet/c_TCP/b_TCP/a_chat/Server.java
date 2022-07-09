package j_internet.c_TCP.b_TCP.a_chat;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

class Server {
    public static void main(String[] args) throws IOException {
        //监听本机的 9999 端口
        ServerSocket serverSocket = new ServerSocket(9999);
        //阻塞在这条语句，直到有用户连接，则返回一个 socket
        Socket socket = serverSocket.accept();
        //接收消息并打印
        InputStream inputStream = socket.getInputStream();
        BufferedReader reader = new BufferedReader(new InputStreamReader(inputStream));
        System.out.println(reader.readLine());
        //向服务器发送消息
        OutputStream outputStream = socket.getOutputStream();
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(outputStream));
        writer.write("hello,client");
        writer.flush();
        socket.shutdownOutput();//结束标记
        //关闭资源
        reader.close();
        writer.close();
        socket.close();
        serverSocket.close();
    }
}
