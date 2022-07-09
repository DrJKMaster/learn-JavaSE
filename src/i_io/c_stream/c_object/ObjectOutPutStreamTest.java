package i_io.c_stream.c_object;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

class ObjectOutPutStreamTest {
    public static void main(String[] args) {
        File file = new File("F:\\oos.dat");
        ObjectOutputStream stream = null;
        try {
            stream = new ObjectOutputStream(new FileOutputStream(file));
            stream.writeInt(100);
            stream.writeBoolean(true);
            stream.writeChar('c');
            stream.writeUTF("黑炭");
            //保存 Object 时，必须使之继承序列化接口
            stream.writeObject(new Dog("旺财", 10));
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
