package c_common_class.b_string.a_string;

class Create {
    public static void main(String[] args) {
        //String 是 final 类，不可被继承

        constructor();
        twoWays();
        concat();
    }

    private static void constructor() {
        //常用构造器
        char[] chars = {'a', 'b', 'c'};
        byte[] bytes = {97, 98, 99};
        String s1 = new String();               //String()
        String s2 = new String(s1);             //String(String original)
        String s3 = new String(chars);          //String(char value[])
        String s4 = new String(chars, 1, 2);    //String(char value[], int offset, int count)
        String s5 = new String(bytes);          //String(byte[] bytes)

        //private final byte[] value;
        //String 类维护了一个 byte 数组用于存储信息
        //final：说明 value 的值不可变
        //value 的值是字符数组的地址而非字符数组的值，所以字符串可被修改
    }

    private static void twoWays() {
        //两种创建方法
        String s1 = "abc";
        String s2 = new String("abc");
        System.out.println(s1 == s2); //false
        //String s1 = "abc"：
        //  在常量池寻找是否有 "abc"，如果没有则创建 "abc" 后指向
        //String s2 = new String("abc")：
        //  在堆区创建 String 变量 s2，然后 s2 的 value 属性值指向常量池的 "abc"
        //  （在常量池寻找是否有 "abc"，如果没有则创建 "abc" 后指向）
        System.out.println(s1 == s2.intern()); //true
        //intern：
        //  如果常量池中有该字符串，则返回池中字符串的引用
        //  如果没有则先创建再返回引用
    }

    private static void concat() {
        String ss1 = "Hello," + "World!";
        //问：该语句会在常量池创建几个字符串常量
        //答：1个，编译器会自动优化

        String s1 = "Hello,";
        String s2 = "World!";
        String ss2 = s1 + s2;
        //第三条语句执行顺序（可能只适用于jdk8）
        //1.new 一个匿名 StringBuilder（记作sb）
        //2.sb.append(sss1)（将sss1追加到sb上）
        //3.sb.append(sss2)（将sss2追加到sb上）
        //3.sb.toString(value,0,count)（调用sb的toString方法new一个字符串并返回）
        //共计3个字符串常量，1个 String 对象，1个匿名 StringBuilder 对象

        System.out.println(ss1 == ss2);
        System.out.println(ss1.equals(ss2));
    }
}
