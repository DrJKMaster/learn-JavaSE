package i_io.c_stream.d_standard;

import java.io.FileNotFoundException;
import java.io.PrintStream;

class Test {
    public static void main(String[] args) throws FileNotFoundException {
        System.out.println(System.in.getClass());
        System.out.println(System.out.getClass());

        System.setOut(new PrintStream("F:\\out.txt"));
        System.out.println("黑炭");
    }
}
