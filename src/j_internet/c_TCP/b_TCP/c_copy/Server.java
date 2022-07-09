package j_internet.c_TCP.b_TCP.c_copy;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

class Server {
    public static void main(String[] args) throws IOException {
        File file = new File("src\\Infinity.wav");
        BufferedOutputStream outputStream = null;
        ServerSocket serverSocket = new ServerSocket(9999);
        Socket socket = serverSocket.accept();
        InputStream inputStream = socket.getInputStream();
        try {
            outputStream = new BufferedOutputStream(new FileOutputStream(file));
            outputStream.write(inputStream.readAllBytes());
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } finally {
            try {
                outputStream.close();
                inputStream.close();
                socket.close();
                serverSocket.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
