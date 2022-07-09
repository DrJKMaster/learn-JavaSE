package i_io.c_stream.a_file;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

class FileOutputStreamTest {
    public static void main(String[] args) {
        //使用 FileOutputStream 写入文件时
        //1.如果文件不存在，则会创建文件（前提是目录存在）
        File file = new File("F:\\hello.txt");

        //构造器
        //1.FileOutputStream(File file)
        //如果原文件存在则会覆盖
        //2.FileOutputStream(File file, boolean append)
        //如果 append 置为 true，则以追加方式写入

        //写入
        write(file);
        writes(file);
    }

    private static void write(File file) {
        FileOutputStream stream = null;
        try {
            stream = new FileOutputStream(file);
            stream.write('h');
            stream.write('e');
            stream.write('l');
            stream.write('l');
            stream.write('o');
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

    private static void writes(File file) {
        FileOutputStream stream = null;
        try {
            stream = new FileOutputStream(file, true);
            byte[] bytes = {',', 'w', 'o', 'r', 'l', 'd'};
            stream.write(bytes);
            //stream.write(",world".getBytes());
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
