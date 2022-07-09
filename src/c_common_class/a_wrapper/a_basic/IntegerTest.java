package c_common_class.a_wrapper.a_basic;

@SuppressWarnings("all")
class IntegerTest {
    public static void main(String[] args) {
        packAndUnpack();
        integer2String();
        string2Integer();
        create();
        compare();
        customMethod();
    }

    private static void packAndUnpack() {
        //jdk4及之前，手动装箱
        Integer integer1 = new Integer(1);
        Integer integer2 = Integer.valueOf(1);
        //jdk4及之前，手动拆箱
        int int1 = integer1.intValue();

        //jdk5及之后，自动装箱，底层为 Integer.valueOf()
        Integer integer3 = 1;
        //jdk5及之后，自动拆箱，底层为 intValue()
        int int2 = integer1;
    }

    private static void integer2String() {
        Integer integer = 100;
        //方式1
        String string1 = integer + "";
        //方式2
        String string2 = integer.toString();
        //方式3
        String string3 = Integer.toString(integer);
        //方式4
        String string4 = String.valueOf(integer);
    }

    private static void string2Integer() {
        String string = "999";
        //方式1
        Integer integer1 = Integer.parseInt(string);
        //方式2
        Integer integer2 = Integer.valueOf(string);
        //方式3
        Integer integer3 = new Integer(string);
    }

    private static void create() {
        Integer integer1 = 1;
        Integer integer2 = 1;
        System.out.println(integer1 == integer2);//True

        Integer integer3 = 128;
        Integer integer4 = 128;
        System.out.println(integer3 == integer4);//False

        //自动装箱时调用 ValueOf 方法
        //如果被装箱的 -128 <= int <= 127，则从缓存区获得，而非 new 一个新的 Intager 对象
        //从缓存区获得的 Integer 对象地址固定
    }

    private static void compare() {
        Integer integer = 128;
        int i = 128;
        System.out.println(integer == i);
        //包装类型与基本数据类型比较时，不论顺序如何，包装类型都会自动拆箱
    }

    private static void customMethod() {
        System.out.println(Integer.MAX_VALUE);
        System.out.println(Integer.MIN_VALUE);
    }
}
