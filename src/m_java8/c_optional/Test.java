package m_java8.c_optional;

import java.util.Optional;

public class Test {
    public static void main(String[] args) {
        //Optional 类是一个容器类，它可以存储 null 或者有值的对象
        //创建
        Optional<String> optional1 = Optional.of("hello");
        Optional<String> optional2 = Optional.empty();
        Optional<String> optional3 = Optional.ofNullable(null);

        //判断
        //1.isPresent()：判断是否有值
        System.out.println(optional1.isPresent());
        //2.ifPresent(Consumer action)：如果非空则执行 action
        optional1.ifPresent(System.out::println);

        //获取
        //1.get()：如果有值则返回，否则抛出异常
        System.out.println(optional1.get());
        //2.orElse(T other)：如果有值则返回，否则返回 other
        System.out.println(optional2.orElse("world"));
        //3.orElseGet(Supplier supplier)：如果有值则返回，否则返回 supplier.get()
        System.out.println(optional2.orElseGet(() -> "hello"));
        //4.orElseThrow(Supplier supplier)：如果有值则返回，否则抛出 supplier.get()
        System.out.println(optional2.orElseThrow(() -> new RuntimeException("wow")));
    }
}
