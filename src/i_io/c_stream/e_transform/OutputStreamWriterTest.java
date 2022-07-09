package i_io.c_stream.e_transform;

import java.io.*;

class OutputStreamWriterTest {
    public static void main(String[] args) {
        File file = new File("F:\\hello.txt");
        BufferedWriter writer = null;
        try {
            writer = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(file), "GBK"));
            writer.write("黑炭");
        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            try {
                writer.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
