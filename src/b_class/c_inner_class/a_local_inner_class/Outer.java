package b_class.c_inner_class.a_local_inner_class;

//局部内部类
//定义域：方法体/代码块中
//作用域：方法体/代码块中
//不能使用访问修饰符
//访问外部类的同名属性应使用“外部类名.this.属性名”的格式

class Outer {
    private final int temp = 0;

    public void f() {
        class Inner {
            private final int temp = 1;

            public void f() {
                System.out.println("外部类中的temp=" + Outer.this.temp);
                System.out.println("局部内部类中的temp=" + temp);
            }
        }

        Inner inner = new Inner();
        inner.f();
    }
}
