package m_java8.b_stream.c_end;

import static m_java8.b_stream.a_create.Create.getStream;

class Matching {
    public static void main(String[] args) {
        //匹配与查找
        //1.allMatch(Predicate predicate)：如果所有元素都通过判定，返回 true
        System.out.println(getStream().allMatch(x -> x > 0));
        //2.anyMatch(Predicate predicate)：任一元素通过判定，返回 true
        System.out.println(getStream().anyMatch(x -> x > 9));
        //3.noneMatch(Predicate predicate)：如果所有元素都不通过判定，返回 true
        System.out.println(getStream().noneMatch(x -> x > 9));
        //4.findFirst()：返回第一个元素的 Optional
        System.out.println(getStream().findFirst());
        //5.findAny()：返回任意一个元素的 Optional
        System.out.println(getStream().findAny());
        //6.max(Comparator comparator)：返回最大值的 Optional
        System.out.println(getStream().max(Integer::compareTo));
        //7.min(Comparator comparator)：返回最小值的 Optional
        System.out.println(getStream().min(Integer::compareTo));
        //8.count()：返回元素个数
        System.out.println(getStream().count());
        //9.forEach(Consumer action)：遍历元素
        getStream().forEach(System.out::println);
    }
}
