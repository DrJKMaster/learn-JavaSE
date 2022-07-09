package b_class.e_enum;

import java.util.Arrays;

class CommonMethod {
    public static void main(String[] args) {
        //1.name()：返回对象的名字
        System.out.println("1.name()：返回对象的名字");
        System.out.println("SPRING的名字：" + SeasonEnum.SPRING.name());

        //2.ordinal()：返回对象的索引（从0开始）
        System.out.println("2.ordinal()：返回对象的索引（从0开始）");
        System.out.println("SUMMER的索引：" + SeasonEnum.SUMMER.ordinal());

        //3.values()：返回对象的数组
        System.out.println("3.values()：返回对象的数组");
        SeasonEnum[] seasons = SeasonEnum.values();
        System.out.println(Arrays.toString(seasons));

        //4.ValueOf()：将字符串转化为枚举对象，如果没有该对象则报错
        System.out.println("4.ValueOf()：将字符串转化为枚举对象，如果没有该对象则报错");
        SeasonEnum autumn = SeasonEnum.valueOf("AUTUMN");
        System.out.println(autumn);

        //5.compareTo(EnumSeason o)：返回两对象的索引值之差
        System.out.println("5.compareTo(EnumSeason o)：返回两对象的索引值之差");
        System.out.println("WINTER 与 SPRING 的索引值之差：" + SeasonEnum.WINTER.compareTo(SeasonEnum.SPRING));
    }
}
