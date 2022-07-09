package i_io.c_stream.a_file;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriterTest {
    public static void main(String[] args) {
        //使用 FileWriter 写入文件时
        //1.如果文件不存在，则会创建文件（前提是目录存在）
        //2.如果不执行 close()，或 flush()，则字符不会写入到文件
        File file = new File("F:\\hello.txt");

        //构造器
        //1.FileWriter(File file)
        //如果原文件存在则会覆盖
        //2.FileWriter(File file, boolean append)
        //如果 append 置为 true，则以追加方式写入

        write(file);
        writes(file);
    }

    private static void write(File file) {
        FileWriter writer = null;
        try {
            writer = new FileWriter(file);
            writer.write('h');
            writer.write('e');
            writer.write('l');
            writer.write('l');
            writer.write('o');
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

    private static void writes(File file) {
        FileWriter writer = null;
        try {
            writer = new FileWriter(file, true);
            writer.write(",world");
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
