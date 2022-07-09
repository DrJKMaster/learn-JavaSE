package b_class.c_inner_class.b_anonymous_inner_class;

//匿名内部类
//定义域：方法体/代码块中
//作用域：方法体/代码块中
//不能使用访问修饰符
//访问外部类的同名属性应使用“外部类名.this.属性名”的格式

//既是类也是对象，当某个类只想使用一次时，可使用匿名内部类
//new [匿名内部类要实现的接口或要继承的对象](参数列表)

class Outer {
    public void f() {

        //调用匿名内部类中方法的方式1
        Inter inner = new Inter() {
            @Override
            public void cry() {
                System.out.println("匿名内部类1的名字：" + this.getClass());
            }
        };
        inner.cry();

        //调用匿名内部类中方法的方式2
        new AbstractClass(100) {
            @Override
            public void cry() {
                System.out.println("匿名内部类2的名字：" + this.getClass());
                System.out.println(this.getAge());
            }
        }.cry();

        //匿名类最佳实践：将匿名类作为参数使用
        anonymousF(new Inter() {
            @Override
            public void cry() {
                System.out.println("匿名内部类3的名字：" + this.getClass());
            }
        });
    }

    private void anonymousF(Inter inter) {
        inter.cry();
    }
}
