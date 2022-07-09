package i_io.c_stream.a_file;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

class FileCopyTest {
    public static void main(String[] args) {
        File file1 = new File("F:\\Infinity.wav");
        File file2 = new File("F:\\Infinity-1.wav");
        FileInputStream inputStream = null;
        FileOutputStream outputStream = null;
        long start = System.currentTimeMillis();
        try {
            inputStream = new FileInputStream(file1);
            outputStream = new FileOutputStream(file2);
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
        long end = System.currentTimeMillis();
        System.out.println("用时" + (end - start) + "ms");
    }
}
