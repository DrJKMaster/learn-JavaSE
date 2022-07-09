package b_class.c_inner_class.d_static_inner_class;

//静态内部类
//定义域：类变量位置
//作用域：整个类
//可以使用访问修饰符
//访问外部类的同名静态属性应使用“外部类名.属性名”的格式

class Outer {
    private static final int temp = 0;

    static class Inner {
        private static final int temp = 1;

        void f() {
            System.out.println("外部类中的temp=" + Outer.temp);
            System.out.println("静态内部类中的temp=" + temp);
        }
    }

    public static Inner getInnerInstance() {
        return new Inner();
    }
}
