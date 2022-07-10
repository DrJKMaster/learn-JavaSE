package m_java8.b_stream.b_mid;

import static m_java8.b_stream.a_create.Create.getStream;

class Screening {
    public static void main(String[] args) {
        //筛选与切片
        //1.filter(Predicate predicate)：筛选，保留满足 predicate 条件的元素
        getStream().filter(x -> x > 5).forEach(System.out::println);
        //2.limit(long maxSize)：截取，保留前 maxSize 个元素
        getStream().limit(2).forEach(System.out::println);
        //3.skip(long n)：跳过前 n 个元素，保留剩余元素
        getStream().skip(8).forEach(System.out::println);
        //4.distinct()：去除重复元素，判定标准是流中存储的对象的 hashcode 和 equals 方法
        getStream().distinct().forEach(System.out::println);
    }
}
