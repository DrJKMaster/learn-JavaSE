package g_collection_and_map.b_collection.d_set.b_linked_hash_set;

import java.util.LinkedHashSet;
import java.util.Set;

@SuppressWarnings("all")
class Create {
    public static void main(String[] args) {
        //HashSet 的子类
        //构造器（LinkedHashSet 本质为 LinkedHashMap）
        //1.LinkedHashSet()：初始化一个 LinkedHashMap 容量为 16，加载因子为 0.75
        Set set1 = new LinkedHashSet();
        //2.LinkedHashSet(int initialCapacity)：初始化一个 LinkedHashMap 容量为 initialCapacity，加载因子为 0.75
        Set set2 = new LinkedHashSet(5);
        //3.LinkedHashSet(int initialCapacity, float loadFactor)：初始化一个 LinkedHashMap 容量为 initialCapacity，加载因子为 loadFactor
        Set set3 = new LinkedHashSet(5, 1.0F);
        //4.LinkedHashSet(Collection<? extends E> c)：super(Math.max(2*c.size(), 11), .75f, true)
        Set set4 = new LinkedHashSet(set1);

        //存储方式：数组 + 链表 + 红黑树 + 双向链表
        //当数据量较小时，以数组 + 链表方式存储；当数据量较大时，以数组 + 红黑树方式存储
        //通过双向链表使得存储与读取顺序一致，但仍不允许添加重复元素
        //双向链表实现方法：进一步包装 Node 为 Entry，增加 before 和 after 属性指向前一个或后一个节点
        //遍历时按 Entry 节点顺序输出，使得看起来存储与输出是有序的

        //扩容机制
        //当 table 中的所有结点总数量达到 thredhold 时，table 进行二倍扩容
        //  thredhold = capacity * loadFactor(默认为 0.75)
    }
}
