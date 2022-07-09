package i_io.c_stream.a_file;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

class FileInputStreamTest {
    public static void main(String[] args) {
        File file = new File("F:\\hello.txt");
        read(file);
        reads(file);
    }

    private static void read(File file) {
        FileInputStream stream = null;
        try {
            stream = new FileInputStream(file);
            int readDate;
            while ((readDate = stream.read()) != -1) {
                System.out.print((char) readDate);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            try {
                stream.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }

    private static void reads(File file) {
        FileInputStream stream = null;
        try {
            stream = new FileInputStream(file);
            byte[] readDate = new byte[4];
            int readLength = 0;
            while ((readLength = stream.read(readDate)) != -1) {
                System.out.print(new String(readDate, 0, readLength));
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            try {
                stream.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
