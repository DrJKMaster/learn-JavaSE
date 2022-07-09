package k_reflection.b_basic;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

class Test {
    public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException, NoSuchMethodException, InvocationTargetException, NoSuchFieldException {
        //获得 Class 对象
        Class aClass = Class.forName("k_reflection.a_public.Dog");
        //根据 Class 对象创建对象
        Object o = aClass.newInstance();
        System.out.println("o的运行类型：" + o.getClass());

        //注意，只能访问公开的字段、构造器与方法
        //根据 Class 对象获取字段
        Field name = aClass.getField("name");
        System.out.println(name.get(o));
        //根据 Class 对象获取构造器，括号中指定参数类型的 Class 对象，如果为空则返回无参构造器
        Constructor constructor1 = aClass.getConstructor();
        Constructor constructor2 = aClass.getConstructor(String.class);
        //根据 Class 对象获取方法
        Method hi = aClass.getMethod("hi");
        hi.invoke(o);
    }
}
