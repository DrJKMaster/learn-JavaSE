package i_io.c_stream.b_buffered;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

class BufferedReaderTest {
    public static void main(String[] args) {
        File file = new File("F:\\hello.txt");
        BufferedReader reader = null;
        try {
            reader = new BufferedReader(new FileReader(file));
            String line;
            //readLine 返回的字符串不包含换行符
            while ((line = reader.readLine()) != null)
                System.out.println(line);
        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            try {
                reader.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
