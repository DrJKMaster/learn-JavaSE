package k_reflection.g_create_class;

import org.junit.jupiter.api.Test;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

class Create {
    private static final String classPath = "o_reflection.Dog";
    private static final Class<?> cls;

    static {
        try {
            cls = Class.forName(classPath);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }

    @Test
    public void create_01() throws InstantiationException, IllegalAccessException {
        //通过 public 的无参构造器创建对象实施
        Object o = cls.newInstance();
        System.out.println(o);
    }

    @Test
    public void create_02() throws NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
        //通过 public 的有参构造器创建对象实施
        Constructor<?> constructor = cls.getConstructor(String.class);
        Object o = constructor.newInstance("black");
        System.out.println(o);
    }

    @Test
    public void create_03() throws NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
        //通过非 public 的有参构造器创建对象实施
        Constructor<?> declaredConstructor = cls.getDeclaredConstructor(int.class, String.class, int.class, String.class, String.class);
        declaredConstructor.setAccessible(true);//爆破
        Object o = declaredConstructor.newInstance(0, "black", 9, "杨", "sleep");
        System.out.println(o);
    }
}
