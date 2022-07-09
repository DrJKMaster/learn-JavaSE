package g_collection_and_map.b_collection.c_list.a_common_method;

import java.util.ArrayList;
import java.util.List;

class CommonMethod {
    public static void main(String[] args) {
        List<Object> list = new ArrayList<>();
        list.add("sss");
        list.add(1.0);
        list.add(true);
        list.add("sss");//元素可重复
        list.add("sss");
        list.add(null);
        System.out.println(list);

        //1.add：在指定位置添加元素
        //  addAll：在指定位置添加多个元素
        list.add(1, "yo");
        System.out.println(list);
        //2.get：通过下标获取元素
        System.out.println(list.get(3));
        //3.set：通过下标修改元素
        list.set(3, "yoo");
        System.out.println(list.get(3));
        //4.indexOf：返回元素在 list 中首次出现的位置
        System.out.println(list.indexOf("sss"));
        //5.lastIndexOf：返回元素在 list 中最后出现的位置
        System.out.println(list.lastIndexOf("sss"));
        //6.subList：返回 [fromIndex, toIndex) 的一个子集
        //  注意，对子集操作会影响原集合，反之亦然
        List<Object> subList = list.subList(0, 3);
        System.out.println(subList);
    }
}
