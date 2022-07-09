package i_io.c_stream.b_buffered;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

class BufferedWriterTest {
    public static void main(String[] args) {
        File file = new File("F:\\hello.txt");
        BufferedWriter writer = null;
        try {
            writer = new BufferedWriter(new FileWriter(file));
            String line = "sss";
            writer.write(line);
            //newLine 换行，且适配不同的系统
            writer.newLine();
            writer.write(line);
            writer.newLine();
            writer.write(line);
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
