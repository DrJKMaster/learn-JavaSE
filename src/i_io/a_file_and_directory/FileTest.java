package i_io.a_file_and_directory;

import org.junit.jupiter.api.Test;

import java.io.File;
import java.io.IOException;

class FileTest {
    @Test
    public void create1() throws IOException {
        File file = new File("F:\\create1.txt");
        file.createNewFile();
    }

    @Test
    public void create2() throws IOException {
        File file1 = new File("F:\\");
        File file2 = new File(file1, "create2.txt");
        file2.createNewFile();
    }

    @Test
    public void create3() throws IOException {
        File file = new File("F:\\", "create3.txt");
        file.createNewFile();
    }

    @Test
    public void info() throws IOException {
        File file = new File("F:\\information.txt");
        file.createNewFile();
        System.out.println("文件名：" + file.getName());
        System.out.println("文件路径：" + file.getPath());
        System.out.println("文件绝对路径：" + file.getAbsolutePath());
        System.out.println("文件父目录：" + file.getParent());
        System.out.println("文件大小（字节）：" + file.length());
        System.out.println("文件是否存在：" + file.exists());
        System.out.println("文件是否是文件：" + file.isFile());
        System.out.println("文件是否是目录：" + file.isDirectory());
    }

    @Test
    public void preDelete() throws IOException {
        File file = new File("F:\\delete.txt");
        file.createNewFile();
    }

    @Test
    public void delete() {
        File file = new File("F:\\delete.txt");
        if (file.exists()) {
            file.delete();
            System.out.println("删除成功");
        } else {
            System.out.println("文件不存在");
        }
    }
}
