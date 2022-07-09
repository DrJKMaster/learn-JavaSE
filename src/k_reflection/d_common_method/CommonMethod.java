package k_reflection.d_common_method;

import org.junit.jupiter.api.Test;

import java.lang.annotation.Annotation;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Arrays;

class CommonMethod {
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
    public void api_01() {
        //1.getClass：返回运行类型 //System.out.println(cls);返回指向的类的全类名
        System.out.println(cls.getClass());
        //2.getPackageName：返回包名
        System.out.println(cls.getPackageName());
        //3.getName：返回全类名
        System.out.println(cls.getName());
        //4.getSimpleName：返回简单类名
        System.out.println(cls.getSimpleName());
    }

    @Test
    public void api_02() {
        //1.getPackage：返回包
        Package clsPackage = cls.getPackage();
        System.out.println(clsPackage);
        //2.getSuperclass：返回父类
        Class<?> clsSuperclass = cls.getSuperclass();
        System.out.println(clsSuperclass);
        //3.getInterfaces：返回接口
        Class<?>[] clsInterfaces = cls.getInterfaces();
        for (Class<?> clsInterface : clsInterfaces) {
            System.out.println(clsInterface);
        }
        //4.getAnnotations：返回注解
        Annotation[] clsAnnotations = cls.getAnnotations();
        for (Annotation clsAnnotation : clsAnnotations) {
            System.out.println(clsAnnotation);
        }
    }

    @Test
    public void api_03() {
        api_03_01();
        api_03_02();
        api_03_03();
    }

    @Test
    public void api_03_01() {
        //1.getFields：返回公开的属性，包括父类
        Field[] fields = cls.getFields();
        for (Field field : fields) {
            System.out.println(field);
        }
        System.out.println("=====");
        //2.getDeclaredFields：返回所有属性，不包括父类
        Field[] declaredFields = cls.getDeclaredFields();
        for (Field declaredField : declaredFields) {
            System.out.println(declaredField);
        }
    }

    @Test
    public void api_03_02() {
        //3.getMethods：返回公开的方法，包括父类
        Method[] methods = cls.getMethods();
        for (Method method : methods) {
            System.out.println(method);
        }
        System.out.println("=====");
        //4.getDeclaredMethods：返回所有方法，不包括父类
        Method[] declaredMethods = cls.getDeclaredMethods();
        for (Method declaredMethod : declaredMethods) {
            System.out.println(declaredMethod);
        }
    }

    @Test
    public void api_03_03() {
        //5.getConstructors：返回公开的构造器，不包括父类
        Constructor[] constructors = cls.getConstructors();
        for (Constructor constructor : constructors) {
            System.out.println(constructor);
        }
        System.out.println("=====");
        //6.getDeclaredConstructors：返回所有构造器，不包括父类
        Constructor[] declaredConstructors = cls.getDeclaredConstructors();
        for (Constructor declaredConstructor : declaredConstructors) {
            System.out.println(declaredConstructor);
        }
    }

    @Test
    public void api_04() throws Exception {
        //1.newInstance：创建对象实例（已弃用）
        Object o = cls.newInstance();
        System.out.println(o);
        //2.getField：返回属性对象
        Field name = cls.getField("name");
        System.out.println(name);
        //3.get：获取对象的属性
        System.out.println(name.get(o));
        //4.set：更改对象的值
        name.set(o, "black");
        System.out.println(name.get(o));
    }

    @Test
    public void api_05() {
        Field[] declaredFields = cls.getDeclaredFields();
        for (Field declaredField : declaredFields) {
            //1.getModifiers：以 int 形式返回修饰符
            //  default:0  public:1  private:2  protected:4  static:8  final:16
            int modifiers = declaredField.getModifiers();
            //2.getType：返回属性的类型
            Class<?> type = declaredField.getType();
            //3.getName：返回属性的名字
            String name = declaredField.getName();

            System.out.println("修饰符：" + modifiers + " 类型：" + type + " 名字：" + name);
        }
    }

    @Test
    public void api_06() {
        Method[] declaredMethods = cls.getDeclaredMethods();
        for (Method declaredMethod : declaredMethods) {
            //1.getModifiers：以 int 形式返回修饰符
            //  default:0  public:1  private:2  protected:4  static:8  final:16
            int modifiers = declaredMethod.getModifiers();
            //2.getReturnType：返回方法的返回值类型
            Class<?> returnType = declaredMethod.getReturnType();
            //3.getName：返回方法的名字
            String name = declaredMethod.getName();
            //4.getParameterTypes：返回参数类型
            Class<?>[] parameterTypes = declaredMethod.getParameterTypes();

            System.out.print("修饰符：" + modifiers + " 返回类型：" + returnType);
            System.out.println(" 名字：" + name + " 参数类型：" + Arrays.toString(parameterTypes));
        }
    }

    @Test
    public void api_07() {
        Constructor[] declaredConstructors = cls.getDeclaredConstructors();
        for (Constructor declaredConstructor : declaredConstructors) {
            //1.getModifiers：以 int 形式返回修饰符
            //  default:0  public:1  private:2  protected:4  static:8  final:16
            int modifiers = declaredConstructor.getModifiers();
            //2.getName：返回方法的名字
            String name = declaredConstructor.getName();
            //3.getParameterTypes：返回参数类型
            Class<?>[] parameterTypes = declaredConstructor.getParameterTypes();

            System.out.print("修饰符：" + modifiers);
            System.out.println(" 名字：" + name + " 参数类型：" + Arrays.toString(parameterTypes));
        }
    }
}
