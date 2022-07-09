package b_class.c_inner_class.c_member_inner_class;

//成员内部类
//定义域：类变量位置
//作用域：整个类
//可以使用访问修饰符
//访问外部类的同名属性应使用“外部类名.this.属性名”的格式

class Outer {
    private final int temp = 0;

    class Inner {
        private final int temp = 1;

        void f() {
            System.out.println("外部类中的temp=" + Outer.this.temp);
            System.out.println("成员内部类中的temp=" + temp);
        }
    }

    public Inner getInnerInstance() {
        return new Inner();
    }
}
