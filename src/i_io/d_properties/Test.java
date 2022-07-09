package i_io.d_properties;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Properties;

class Test {
    public static void main(String[] args) throws IOException {
        File file = new File("src\\i_io\\d_properties\\test.properties");
        Properties properties = new Properties();
        //从文件加载数据到 properties 对象
        properties.load(new FileReader(file));
        //打印 properties 的数据
        properties.list(System.out);
        //获得指定 key 的 value
        System.out.println(properties.getProperty("a"));
        //添加指定的键值对
        properties.setProperty("d", "ddd");
        //保存到文件
        //null 如果有内容，则在文件最上方添加一行注释
        properties.store(new FileWriter(file), null);
    }
}
