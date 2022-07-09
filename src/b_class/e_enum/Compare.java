package b_class.e_enum;

class Compare {
    public static void main(String[] args) {
        //手动实现枚举
        System.out.println("手动实现枚举");
        System.out.println(SeasonClass.SPRING);
        System.out.println(SeasonClass.SUMMER);
        System.out.println(SeasonClass.AUTUMN);
        System.out.println(SeasonClass.WINTER);

        //enum实现枚举
        System.out.println("enum实现枚举");
        System.out.println(SeasonEnum.SPRING);
        System.out.println(SeasonEnum.SUMMER);
        System.out.println(SeasonEnum.AUTUMN);
        System.out.println(SeasonEnum.WINTER);
    }
}
