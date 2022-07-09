package b_class.e_enum;

// 手动实现枚举

class SeasonClass {
    private final String name;
    private final String description;

    private SeasonClass(String name, String description) {
        this.name = name;
        this.description = description;
    }

    static final SeasonClass SPRING = new SeasonClass("春天", "温暖");
    static final SeasonClass SUMMER = new SeasonClass("夏天", "炎热");
    static final SeasonClass AUTUMN = new SeasonClass("秋天", "凉爽");
    static final SeasonClass WINTER = new SeasonClass("冬天", "寒冷");

    @Override
    public String toString() {
        return "ClassSeason{" + "name='" + name + '\'' + ", description='" + description + '\'' + '}';
    }
}
