package g_collection_and_map.b_collection.d_set.a_hash_set;

import java.util.HashSet;
import java.util.Set;

@SuppressWarnings("all")
class Create {
    public static void main(String[] args) {
        //构造器（HashSet 本质为 HashMap）
        //1.HashSet()：new HashMap()
        Set set1 = new HashSet();
        //2.HashSet(int initialCapacity)：new HashMap(initialCapacity)
        Set set2 = new HashSet(5);
        //3.HashSet(int initialCapacity, float loadFactor)：new HashMap(initialCapacity, loadFactor)
        //  loadFactor：加载因子
        Set set3 = new HashSet(5, 1.0F);
        //4.HashSet(Collection<? extends E> c)：new HashMap(Math.max((int) (c.size()/.75f) + 1, 16))
        Set set4 = new HashSet(set1);

        //存储方式：数组 + 链表 + 红黑树
        //当数据量较小时，以数组 + 链表方式存储；当数据量较大时，以数组 + 红黑树方式存储

        //扩容机制
        //当 table 中的所有结点总数量达到 thredhold 时，table 进行二倍扩容
        //  thredhold = capacity * loadFactor(默认为 0.75)
    }
}
