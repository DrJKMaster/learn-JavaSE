package m_java8.a_lambda;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

class FunctionalInterface {
    public static void main(String[] args) {
        //Java 8 四大内置核心函数式接口
        consumer();
        supplier();
        function();
        predicate();
    }

    //Consumer<T>
    //消费型接口
    private static void consumer() {
        Consumer<String> consumer = (s) -> System.out.println(s);
        consumer.accept("Hello World");
    }

    //Supplier<T>
    //供给型接口
    private static void supplier() {
        Supplier<String> supplier = () -> "Hello World";
        System.out.println(supplier.get());
    }

    //Function<T, R>
    //函数型接口
    private static void function() {
        Function<Integer, String> function = (i) -> i + "";
        System.out.println(function.apply(1));
    }

    //Predicate<T>
    //断言型接口
    private static void predicate() {
        Predicate<String> predicate = (s) -> s.length() > 0;
        System.out.println(predicate.test("Hello World"));
    }
}
