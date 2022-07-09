package j_internet.c_TCP.b_TCP.c_copy;

import java.io.*;
import java.net.InetAddress;
import java.net.Socket;

class Client {
    public static void main(String[] args) throws IOException {
        File file = new File("F:\\Infinity.wav");
        BufferedInputStream inputStream = null;
        Socket socket = new Socket(InetAddress.getLocalHost(), 9999);
        OutputStream outputStream = socket.getOutputStream();
        try {
            inputStream = new BufferedInputStream(new FileInputStream(file));
            outputStream.write(inputStream.readAllBytes());
            socket.shutdownOutput();
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } finally {
            try {
                inputStream.close();
                outputStream.close();
                socket.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
