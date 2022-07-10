package m_java8.a_lambda;

import java.util.Comparator;

public class MethodReferences {
    public static void main(String[] args) {
        //方法引用
        //本质是 lambda 表达式，可以用作函数引用
        //当 lambda 表达式中的内容已经有相应方法实现了，可以使用方法引用
        //1.构造器引用
        //Class::new
        //2.数组引用（需要参数指定数量）
        //Class[]::new
        //3.静态方法引用
        //Class::static_method
        testComparatorUseLambda();
        testComparatorUseMethodReferences();
        //4.特定类的任意实例方法引用
        //Class::method
        testCompareToUseLambda();
        testCompareToUseMethodReferences();
        //5.特定实例方法引用
        //instance::method
    }

    private static void testComparatorUseLambda() {
        Comparator<Integer> comparator = (o1, o2) -> Integer.compare(o1, o2);
        System.out.println(comparator.compare(1, 2));
    }

    private static void testComparatorUseMethodReferences() {
        Comparator<Integer> comparator = Integer::compare;
        System.out.println(comparator.compare(1, 2));
    }

    private static void testCompareToUseLambda() {
        Comparator<Integer> comparator = (o1, o2) -> o1.compareTo(o2);
        System.out.println(comparator.compare(1, 2));
    }

    private static void testCompareToUseMethodReferences() {
        Comparator<Integer> comparator = Integer::compareTo;
        System.out.println(comparator.compare(1, 2));
    }
}
