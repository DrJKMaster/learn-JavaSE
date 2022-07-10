package m_java8.b_stream.c_end;

import static m_java8.b_stream.a_create.Create.getStream;

public class Reducing {
    public static void main(String[] args) {
        //归约
        //1.reduce(T identity, BinaryOperator accumulator)：
        System.out.println(getStream().reduce(0, Integer::sum));
        //2.reduce(BinaryOperator accumulator)：
        System.out.println(getStream().reduce(Integer::sum));
    }
}
