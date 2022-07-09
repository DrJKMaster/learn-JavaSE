package k_reflection.g_reflection_blasting;

import org.junit.jupiter.api.Test;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.time.LocalDateTime;

class BlastingTest {
    private static final String classPath = "o_reflection.Dog";
    private static final Class<?> cls;
    private static final Object o;

    static {
        try {
            cls = Class.forName(classPath);
            o = cls.newInstance();
        } catch (ClassNotFoundException | IllegalAccessException | InstantiationException e) {
            throw new RuntimeException(e);
        }
    }

    @Test
    public void fieldBlasting() throws NoSuchFieldException, IllegalAccessException {
        //1.操作 public 属性
        Field name = cls.getField("name");
        System.out.println(name.get(o));
        name.set(o, "black");
        System.out.println(name.get(o));
        //2.操作 private 属性（爆破）
        Field hobby = cls.getDeclaredField("hobby");
        hobby.setAccessible(true);
        System.out.println(hobby.get(o));
        hobby.set(o, "sleep");
        System.out.println(hobby.get(o));
        //3.操作 static 属性（可以将 o 换成 null）
        Field loop = cls.getField("loop");
        System.out.println(loop.get(null));
        loop.set(null, false);
        System.out.println(loop.get(null));
    }

    @Test
    public void methodBlasting() throws NoSuchFieldException, IllegalAccessException, NoSuchMethodException, InvocationTargetException {
        //1.调用 public 方法
        Method setName = cls.getMethod("setName", String.class);
        setName.invoke(o, "black");
        System.out.println(o);
        //2.调用 private 方法（爆破）
        Method shit = cls.getDeclaredMethod("shit", String.class, String.class, LocalDateTime.class);
        shit.setAccessible(true);
        shit.invoke(o, "yellow", "", LocalDateTime.now());
        System.out.println(o);
        //3.调用 static 方法（可以将 o 换成 null）
        Method no = cls.getMethod("no");
        no.invoke(null);

        //4.返回值
        Object s = no.invoke(null);
        System.out.println(s);
    }
}
