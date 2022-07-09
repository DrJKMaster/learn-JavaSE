package i_io.c_stream.a_file;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

class FileReaderTest {
    public static void main(String[] args) {
        File file = new File("F:\\hello.txt");
        read(file);
        reads(file);
    }

    private static void read(File file) {
        FileReader reader = null;
        try {
            reader = new FileReader(file);
            int readDate;
            while ((readDate = reader.read()) != -1) {
                System.out.print((char) readDate);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            try {
                if (reader != null) {
                    reader.close();
                }
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }

    private static void reads(File file) {
        FileReader reader = null;
        try {
            reader = new FileReader(file);
            char[] readDate = new char[4];
            int readLength = 0;
            while ((readLength = reader.read(readDate)) != -1) {
                System.out.print(new String(readDate, 0, readLength));
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            try {
                if (reader != null) {
                    reader.close();
                }
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
