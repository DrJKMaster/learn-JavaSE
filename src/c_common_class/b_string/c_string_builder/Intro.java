package c_common_class.b_string.c_string_builder;

class Intro {
    public static void main(String[] args) {
        //StringBuffer 的下位替代，不保证线程安全，但效率更高

        //使用场景
        //String：字符串很少被修改，且被多个对象引用，如配置信息
        //StringBuilder：字符串经常被修改，单线程
        //StringBuffer：字符串经常被修改，多线程
    }
}
