package m_java8.b_stream.a_create;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class Create {
    private static final List<Integer> list = new ArrayList<>();
    private static final Integer[] array = {1, 2, 3, 4, 5};

    static {
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
    }

    public static void main(String[] args) {
        //stream 特性
        //1.不存储数据
        //2.不改变源数据
        //3.延迟操作，等到需要时再计算结果

        //创建流（顺序流 stream / 并行流 parallelStream）
        //1.通过集合创建流
        Stream<Integer> listStream = list2Stream();
        Stream<Integer> listParallelStream = list2ParallelStream();

        //2.通过数组创建流
        Stream<Integer> arrayStream = array2Stream();
        Stream<Integer> arrayParallelStream = array2ParallelStream();

        //3.其他方式创建流
        elseCreate();
    }

    public static Stream<Integer> getStream() {
        return Stream.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
    }

    private static Stream<Integer> list2Stream() {
        return list.stream();
    }

    private static Stream<Integer> list2ParallelStream() {
        return list.parallelStream();
    }

    private static Stream<Integer> array2Stream() {
        return Stream.of(array);
        //return Arrays.stream(array);
    }

    private static Stream<Integer> array2ParallelStream() {
        return Stream.of(array).parallel();
        //return Arrays.stream(array).parallel();
    }

    private static void elseCreate() {
        //1.通过 Stream.of 创建流
        streamOf();
        parallelStreamOf();

        //2.无限流
        generate();
        iterate();
    }

    private static void streamOf() {
        Stream<Integer> stream = Stream.of(1, 2, 3, 4, 5);
    }

    private static void parallelStreamOf() {
        Stream<Integer> stream = Stream.of(1, 2, 3, 4, 5).parallel();
    }

    private static void generate() {
        Stream.generate(Math::random)
                .limit(10)
                .forEach(System.out::println);
    }

    private static void iterate() {
        Stream.iterate(0, t -> t + 2)
                .limit(10)
                .forEach(System.out::println);
    }
}
