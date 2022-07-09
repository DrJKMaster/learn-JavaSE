package i_io.c_stream.c_object;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

class ObjectInputStreamTest {
    public static void main(String[] args) {
        File file = new File("F:\\oos.dat");
        ObjectInputStream stream = null;
        try {
            stream = new ObjectInputStream(new FileInputStream(file));
            int num = stream.readInt();
            boolean bool = stream.readBoolean();
            char c = stream.readChar();
            String s = stream.readUTF();
            Dog dog = (Dog) stream.readObject();
            System.out.println(num);
            System.out.println(bool);
            System.out.println(c);
            System.out.println(s);
            System.out.println(dog);
        } catch (IOException | ClassNotFoundException e) {
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
