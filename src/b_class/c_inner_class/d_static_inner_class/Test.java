package b_class.c_inner_class.d_static_inner_class;

class Test {
    public static void main(String[] args) {
        //调用方法1：通过外部类名来new
        Outer.Inner inner1 = new Outer.Inner();
        inner1.f();

        //调用方法2：通过外部类的一个静态方法来返回
        Outer.Inner inner2 = Outer.getInnerInstance();
        inner2.f();
    }
}
