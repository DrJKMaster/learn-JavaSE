package g_collection_and_map.b_collection.c_list.c_vector;

import java.util.List;
import java.util.Vector;

class Create {
    public static void main(String[] args) {
        //构造器
        //1.Vector()：初始化 elementData 容量为 10
        List<Object> list1 = new Vector<>();
        //2.Vector(int initialCapacity)：初始化 elementData 容量为 initialCapacity
        List<Object> list2 = new Vector<>(5);
        //3.Vector(int initialCapacity, int capacityIncrement)：
        //  初始化 elementData 容量为 initialCapacity
        //  并指定每次扩容时增加的容量，如果该值 <= 0，则每次扩容为原先的两倍
        List<Object> list3 = new Vector<>(5, 5);
        //4.Vector(Collection<? extends E> c)：从 Collection 初始化 Vector
        List<Object> list4 = new Vector<>(list1);
    }
}
