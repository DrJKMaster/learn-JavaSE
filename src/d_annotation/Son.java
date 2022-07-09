package d_annotation;

import java.util.ArrayList;
import java.util.List;

//@Deprecated：标记一个元素，表示该元素已过时，不再推荐使用，但仍可继续使用
//使用 @Deprecated 的元素时会有中划线提示
//用于版本兼容和过渡
@Deprecated
class Son extends AbstractClass {
    /*
        @Override 的定义

        @Target(ElementType.METHOD)
        @Retention(RetentionPolicy.SOURCE)
        public @interface Override {
        }
        1.@interface 表示后面的 Override 是一个注解类
        2.@Target @Retention 是修饰注解的注解，称为元注解
     */

    //@Override：标记一个方法，表示该方法为重写方法
    @Override
    public void cry() {
        System.out.println("@Override:cry");
    }

    //@SuppressWarnings：抑制警告信息
    //@SuppressWarnings({"..."，"..."})
    //...处填需要抑制的警告类型，all 为全部警告
    @SuppressWarnings({"rawtypes", "unchecked"})
    public void say() {
        List list = new ArrayList();
        list.add("a");
        list.add("b");
        list.add("c");
        for (Object o : list) {
            System.out.println(o);
        }
    }
}
