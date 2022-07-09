package k_reflection.c_optimize;

import k_reflection.a_public.Dog;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

class Test {
    public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException, NoSuchFieldException, NoSuchMethodException, InvocationTargetException {
        f1();
        f2();
        f3();
    }

    private static void f1() {
        Dog dog = new Dog();
        long start = System.currentTimeMillis();
        for (int i = 0; i < 100000; i++) {
            dog.hi();
        }
        long end = System.currentTimeMillis();
        System.out.println("原始：" + (end - start));
    }

    private static void f2() throws ClassNotFoundException, InstantiationException, IllegalAccessException, NoSuchMethodException, InvocationTargetException {
        Class aClass = Class.forName("k_reflection.a_public.Dog");
        Object o = aClass.newInstance();
        Method hi = aClass.getMethod("hi");
        long start = System.currentTimeMillis();
        for (int i = 0; i < 100000; i++) {
            hi.invoke(o);
        }
        long end = System.currentTimeMillis();
        System.out.println("反射：" + (end - start));
    }

    private static void f3() throws ClassNotFoundException, InstantiationException, IllegalAccessException, NoSuchMethodException, InvocationTargetException {
        Class aClass = Class.forName("k_reflection.a_public.Dog");
        Object o = aClass.newInstance();
        Method hi = aClass.getMethod("hi");
        hi.setAccessible(true);//优化：关闭安全检查
        long start = System.currentTimeMillis();
        for (int i = 0; i < 100000; i++) {
            hi.invoke(o);
        }
        long end = System.currentTimeMillis();
        System.out.println("反射，关闭访问检查：" + (end - start));
    }
}
