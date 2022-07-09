package b_class.e_enum;

//不能继承其他类，因为隐式继承了 Enum 类
enum SeasonEnum {
    //枚举元素必须写在开头处
    //如果有多个元素，元素之间用逗号分隔，最后以分号结尾
    //如果使用无参构造器，则括号可省略
    SPRING("春天", "温暖"),
    SUMMER("夏天", "炎热"),
    AUTUMN("秋天", "凉爽"),
    WINTER("冬天", "寒冷");

    private final String name;
    private final String description;

    // 构造器默认为private
    SeasonEnum(String name, String description) {
        this.name = name;
        this.description = description;
    }

    @Override
    public String toString() {
        return "ClassSeason{" + "name='" + name + '\'' + ", description='" + description + '\'' + '}';
    }
}
