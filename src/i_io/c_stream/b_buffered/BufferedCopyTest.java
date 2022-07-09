package i_io.c_stream.b_buffered;

import java.io.*;

class BufferedCopyTest {
    public static void main(String[] args) {
        File file1 = new File("F:\\Infinity.wav");
        File file2 = new File("F:\\Infinity-1.wav");
        BufferedInputStream inputStream = null;
        BufferedOutputStream outputStream = null;
        long s = System.currentTimeMillis();
        try {
            inputStream = new BufferedInputStream(new FileInputStream(file1));
            outputStream = new BufferedOutputStream(new FileOutputStream(file2));
            byte[] bytes = new byte[1024];
            int len = 0;
            while ((len = inputStream.read(bytes)) != -1) {
                outputStream.write(bytes, 0, len);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            try {
                inputStream.close();
                outputStream.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
        long e = System.currentTimeMillis();
        System.out.println("用时" + (e - s) + "ms");
    }
}
