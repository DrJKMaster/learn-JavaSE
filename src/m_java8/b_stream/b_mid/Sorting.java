package m_java8.b_stream.b_mid;

import java.util.Comparator;

import static m_java8.b_stream.a_create.Create.getStream;

class Sorting {
    public static void main(String[] args) {
        //排序
        //1.sorted()：自然排序
        getStream().sorted().forEach(System.out::println);
        //2.sorted(Comparator comparator)：定制排序
        getStream().sorted(Comparator.reverseOrder()).forEach(System.out::println);
    }
}
