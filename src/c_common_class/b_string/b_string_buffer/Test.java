package c_common_class.b_string.b_string_buffer;

class Test {
    public static void main(String[] args) {
        //通过非 final 的 byte[] value 将字符串存放在堆中

        constructor();
        string2StringBuffer();
        stringBuffer2String();
    }

    private static void constructor() {
        //1.无参，value 数组长度为 16，无内容
        StringBuffer sb1 = new StringBuffer();
        //2.int capacity，设定 value 初始长度为 capacity
        StringBuffer sb2 = new StringBuffer(10);
        //3.String str，设定 value 初始值为 str，初始长度为 str.length() + 16
        StringBuffer sb3 = new StringBuffer("sss");
    }

    private static void string2StringBuffer() {
        String s = "sss";
        //1.通过 StringBuffer 的构造器（如果传入的 s = null ，则会抛出空指针异常）
        StringBuffer sb1 = new StringBuffer(s);
        //2.通过 StringBuffer 的 append 方法
        StringBuffer sb2 = new StringBuffer();
        sb2.append(s);
    }

    private static void stringBuffer2String() {
        StringBuffer sb = new StringBuffer("sss");
        //1.通过 StringBuffer 的 toString 方法
        String s1 = sb.toString();
        //2.通过 String 的构造器
        String s2 = new String(sb);
    }
}
