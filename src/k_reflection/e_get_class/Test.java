package k_reflection.e_get_class;

import k_reflection.a_public.Dog;

class Test {
    public static void main(String[] args) throws ClassNotFoundException {
        //获取 Class 对象的不同方式
        //1.Class.forName：通过全类名获取，适用于配置文件
        Class<?> cls1 = Class.forName("k_reflection.a_public.Dog");
        System.out.println(cls1);
        //2.类名.class：通过类名获取，适用于参数传递
        Class<Dog> cls2 = Dog.class;
        System.out.println(cls2);
        //3.对象名.getClass：通过对象名获取
        Dog dog = new Dog();
        Class<? extends Dog> cls3 = dog.getClass();
        System.out.println(cls3);
        //4.类加载器.loadClass：通过类加载器获取
        ClassLoader classLoader = Dog.class.getClassLoader();
        Class<?> cls4 = classLoader.loadClass("k_reflection.a_public.Dog");
        System.out.println(cls4);
        //5.基本数据类型
        Class<Integer> intClass = int.class;
        Class<Integer> intType = Integer.TYPE;
        Class<Integer> integerClass = Integer.class;
        //以上三个 Class 对象中
        //前两者等价，获取 Class 对象时自动装箱，创建对应的对象时自动拆箱
        //第三个只是普通的获得 Integer 的 Class 对象
        System.out.println(intClass);
        System.out.println(intType);
        System.out.println(integerClass);
        //注意1：void 也有 Class 对象
        System.out.println(void.class);
        //注意2：数组也有 Class 对象
        System.out.println(int[][].class);
        //注意3：注解也有 Class 对象
        System.out.println(Deprecated.class);
        //注意4：Class 类也有 Class 对象
        System.out.println(Class.class);
    }
}
