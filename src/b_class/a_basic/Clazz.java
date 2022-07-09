package b_class.a_basic;

class Clazz {
    //对象被创建时的执行顺序

    //1.类初始化
    //1.1.父类的静态变量
    //1.2.父类的静态代码块
    //1.3.静态变量
    //1.4.静态代码块

    //2.对象初始化
    //2.1.父类的非静态变量
    //2.2.父类的代码块
    //2.3.父类的构造器
    //2.4.非静态变量
    //2.5.代码块
    //2.6.构造器

    //静态代码块可以用于初始化静态成员变量
    static {
        System.out.println("类被加载-静态代码块开始执行");
    }

    {
        System.out.println("对象被创建-代码块开始执行");
    }

    //重写来自 Object（所有类的父类） 的 toString 方法
    @Override
    public String toString() {
        return "Clazz{}";
    }
}
