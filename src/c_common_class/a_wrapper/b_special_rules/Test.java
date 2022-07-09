package c_common_class.a_wrapper.b_special_rules;

class Test {
    public static void main(String[] args) {
        //三元运算符
        Object o = true ? 1 : 2.0;
        System.out.println(o);
        //输出为 1.0
        //三元运算符是一个整体
        //由于两个返回值分别是 int 类型与 double 类型，因此最后返回 double 类型
        System.out.println(o.getClass());
    }
}
