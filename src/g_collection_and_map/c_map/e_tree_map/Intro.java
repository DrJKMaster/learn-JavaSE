package g_collection_and_map.c_map.e_tree_map;

import java.util.Comparator;
import java.util.TreeMap;

@SuppressWarnings("all")
class Intro {
    public static void main(String[] args) {
        //添加元素时根据比较器自动排序

        //构造器
        //1.创建了 TreeMap，其 comparator 值为空
        TreeMap treeMap1 = new TreeMap();
        //2.创建了 TreeMap，其 comparator 值为传入的 new Comparator
        TreeMap treeMap2 = new TreeMap(new Comparator() {
            @Override
            public int compare(Object o1, Object o2) {
                return 0;
            }
        });

        //在添加元素时采用 comparator 比较 key，如果 comparator 值为 null，则采用默认的比较方法
        //第一次添加元素也会调用 compare 方法，目的是判断传入的 key 是否为空

        //如果没有传入 comparator 对象，则调用 key 实现的 Comparator 接口的 compareTo 方法进行比较
        //如果创建 Map 接口对象时没有传入 comparator 对象，且添加的对象的 key 没有实现 Comparable 接口
        //则会报错：类转换异常
    }
}
