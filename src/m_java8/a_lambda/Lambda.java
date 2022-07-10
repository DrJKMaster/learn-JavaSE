package m_java8.a_lambda;

import java.util.Comparator;

class Lambda {
    public static void main(String[] args) {
        //lambda 使用场景
        //实现接口
        //只有一个方法需要实现时，可以使用 lambda 表达式
        //这种接口被称作函数式接口 (functional interface)

        //lambda 语法
        //(参数列表) -> {
        //    方法体
        //}
        //1.当参数列表中只有一个参数时，() 可以省略
        //2.参数类型可省略
        //3.当方法体中只有一条语句时，{} 可以省略
        //4.如果省略 {}，则方法体中的 return 关键字必须省略

        testThread();
        testThreadUseLambda();
        testComparator();
        testComparatorUseLambda();
    }

    private static void testThread() {
        Runnable run = new Runnable() {
            @Override
            public void run() {
                System.out.println("run");
            }
        };

        new Thread(run).start();
    }

    private static void testThreadUseLambda() {
        Runnable run = () -> System.out.println("run");

        new Thread(run).start();
    }

    private static void testComparator() {
        Comparator<Integer> comparator = new Comparator<Integer>() {
            @Override
            public int compare(Integer a, Integer b) {
                return a - b;
            }
        };
        System.out.println(comparator.compare(1, 2));
    }

    private static void testComparatorUseLambda() {
        Comparator<Integer> comparator = (a, b) -> a - b;
        System.out.println(comparator.compare(1, 2));
    }
}
