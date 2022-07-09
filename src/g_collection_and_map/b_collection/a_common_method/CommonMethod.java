package g_collection_and_map.b_collection.a_common_method;

import java.util.ArrayList;
import java.util.Collection;

class CommonMethod {
    public static void main(String[] args) {
        Collection<Object> coll = new ArrayList<>();
        //1.add：增加元素
        //  addAll：增加多个元素
        coll.add("sss");
        coll.add(18);//装载基本数据类型时会进行自动装箱
        coll.add(true);
        System.out.println(coll);
        //2.remove：删除元素
        //  removeAll：删除多个元素
        coll.remove(2);
        coll.remove(Integer.valueOf(18));//填入整数默认删除该下标的元素，此时应进行装箱
        System.out.println(coll);
        //3.contains：检查是否包含某个元素
        //  containsAll：检查是否同时包含多个元素
        System.out.println(coll.contains("sss"));
        //4.size：返回元素个数
        //5.isEmpty：检查是否为空
        //6.clear：清空
    }
}
