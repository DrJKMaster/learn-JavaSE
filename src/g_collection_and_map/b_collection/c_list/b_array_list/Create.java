package g_collection_and_map.b_collection.c_list.b_array_list;

import java.util.ArrayList;
import java.util.List;

class Create {
    public static void main(String[] args) {
        //本质为数组，线程不安全
        //内部维护了一个 elementData 数组保存元素
        //transient Object[] elementData;
        //transient：短暂的，表示不会被串行化（序列化）

        //构造器
        //1.ArrayList()：初始化 elementData 容量为 0
        List<Object> list1 = new ArrayList<>();
        //2.ArrayList(int initialCapacity)：初始化 elementData 容量为 initialCapacity
        List<Object> list2 = new ArrayList<>(5);
        //3.ArrayList(Collection<? extends E> c)：从 Collection 初始化 ArrayList
        List<Object> list3 = new ArrayList<>(list1);

        //扩容规则（各 jdk 版本可能有差别）
        //如果容量为 0，则扩容到 10
        //如果容量不为 1，则扩容到 max(size * 1.5, size + 1)
        list1.add(0);
    }
}
