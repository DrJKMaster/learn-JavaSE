package b_class.c_inner_class.c_member_inner_class;

class Test {
    public static void main(String[] args) {
        //调用方法1：通过外部类的实例来new
        Outer outer = new Outer();
        Outer.Inner inner1 = outer.new Inner();
        inner1.f();

        //调用方法2：通过外部类的一个方法来返回
        Outer.Inner inner2 = outer.getInnerInstance();
        inner2.f();
    }
}
