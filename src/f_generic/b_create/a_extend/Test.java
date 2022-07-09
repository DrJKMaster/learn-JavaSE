package f_generic.b_create.a_extend;

import java.util.ArrayList;
import java.util.List;

class Test {
    public static void main(String[] args) {
        //泛型方法被调用时，会根据参数类型自动确认泛型类型
        System.out.println(f("Hi", 0));
        System.out.println(f("Hello", 'c'));

        //泛型没有继承关系
        //ArrayList<Object> strings1 = new ArrayList<String>();
        List<String> strings2 = new ArrayList<>();
        ArrayList<String> strings3 = new ArrayList<>();

        //根据 DDD 的定义，泛型类型只能为 BB 或 BB 的子类
        //DDD<AA> ddd1 = new DDD<>();
        DDD<BB> ddd2 = new DDD<>();
        DDD<CC> ddd3 = new DDD<>();
    }

    //泛型方法
    private static <T, R> int f(T t, R r) {
        return t.hashCode() - r.hashCode();
    }

    //无限定通配符（对传入的 List 的元素类型无限制）
    private static void f1(List<?> a) {
        for (Object o : a) {
            System.out.println(o);
        }
    }

    //上界通配符（要求传入的 List 的元素类型为 BB 或是 BB 的子类）
    private static void f2(List<? extends BB> a) {
        for (Object o : a) {
            System.out.println(o);
        }
    }

    //下界通配符（要求传入的 List 的元素类型为 BB 或是 BB 的超类）
    private static void f3(List<? super BB> a) {
        for (Object o : a) {
            System.out.println(o);
        }
    }
}
