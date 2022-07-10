package m_java8.b_stream.b_mid;

import java.util.stream.Stream;

import static m_java8.b_stream.a_create.Create.getStream;

class Mapping {
    public static void main(String[] args) {
        //映射
        //1.map(Function mapper)：将流中的每个元素转换为另一个元素
        getStream().map(Math::sqrt).forEach(System.out::println);
        //2.flatMap(Function mapper)：
        //将流中的每个元素视为都一个流，对其中的每个流执行 map 操作，并将所有结果合并成一个流
        testFlatMap();
        //3.mapToInt(ToIntFunction mapper)：将流中的每个元素转换为整数，并将所有结果合并成一个流
        //getStream().mapToInt(Integer::parseInt).forEach(System.out::println);
        //4.mapToDouble(ToDoubleFunction mapper)：将流中的每个元素转换为浮点数，并将所有结果合并成一个流
        //getStream().mapToDouble(Double::parseDouble).forEach(System.out::println);
        //5.mapToLong(ToLongFunction mapper)：将流中的每个元素转换为长整数，并将所有结果合并成一个流
        //getStream().mapToLong(Long::parseLong).forEach(System.out::println);
    }

    private static void testFlatMap() {
        //准备流
        Stream<String> stream = Stream.of("hello", "world");
        stream.flatMap(Mapping::toUpperCase).forEach(System.out::println);
    }

    public static Stream<Character> toUpperCase(String s) {
        return s.chars().mapToObj(c -> (char) c).map(Character::toUpperCase);
    }
}
