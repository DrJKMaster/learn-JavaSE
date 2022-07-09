package g_collection_and_map.b_collection.c_list.d_linked_list;

import java.util.LinkedList;
import java.util.List;

class Create {
    public static void main(String[] args) {
        //构造器
        //1.LinkedList()：
        List<Object> list1 = new LinkedList<>();
        //2.LinkedList(Collection<? extends E> c)：从 Collection 初始化 LinkedList
        List<Object> list2 = new LinkedList<>(list1);

        //常用方法
        //1.add：在末尾增加元素
        //2.remove：删除某个元素（默认删除第一个元素）
        //3.get：通过下标获取元素
        //4.set：通过下标修改元素
    }
}
