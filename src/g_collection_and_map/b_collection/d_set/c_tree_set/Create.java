package g_collection_and_map.b_collection.d_set.c_tree_set;

import java.util.Comparator;
import java.util.TreeSet;

@SuppressWarnings("all")
class Create {
    public static void main(String[] args) {
        //添加元素时根据比较器自动排序
        //构造器
        //1.创建了 TreeMap，其 comparator 值为空
        TreeSet treeSet1 = new TreeSet();
        //2.创建了 TreeMap，其 comparator 值为传入的 new Comparator
        TreeSet treeSet2 = new TreeSet(new Comparator() {
            @Override
            public int compare(Object o1, Object o2) {
                return 0;
            }
        });

        //在添加元素时采用 comparator 比较，如果 comparator 值为 null，则采用默认的比较方法
    }
}
