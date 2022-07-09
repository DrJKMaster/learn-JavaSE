package i_io.a_file_and_directory;

import org.junit.jupiter.api.Test;

import java.io.File;

class DirectoryTest {
    @Test
    public void mkdirs() {
        File file = new File("F:\\zzz\\zzz\\zzz\\zzz");
        file.mkdir();//创建一级目录
        file.mkdirs();//创建多级目录
    }
}
