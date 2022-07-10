package m_java8.b_stream.c_end;

import java.util.List;
import java.util.stream.Collectors;

import static m_java8.b_stream.a_create.Create.getStream;

public class Collecting {
    public static void main(String[] args) {
        //收集
        //collect(Collector collector)：将流对象重新转化为集合对象
        //collector 属性可由 Collectors 类提供
        List<Integer> list = getStream().collect(Collectors.toList());
        System.out.println(list);
    }
}
