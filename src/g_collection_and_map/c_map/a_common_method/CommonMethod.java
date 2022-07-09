package g_collection_and_map.c_map.a_common_method;

import java.util.HashMap;
import java.util.Map;

@SuppressWarnings("all")
class CommonMethod {
    public static void main(String[] args) {
        Map map = new HashMap();
        //1.put：增加键值对
        //  putAll：增加多个键值对
        map.put("no1", "s1");
        map.put("no2", "s2");
        map.put("no3", "s3");
        System.out.println(map);
        //当要存储的键值对中的 key 已经存在，则替换 value
        map.put("no3", "ss");
        System.out.println(map);
        //2.get：通过 key，查找对应的 value（如果找不到则返回 null）
        System.out.println(map.get("no1"));
        //3.remove：通过 key，删除对应的 node
        //4.size：获取 node 的个数
        //5.isEmpty：判断 node 数量是否为 0
        //6.clear：清除 table 表
        //7.containsKey：通过 key，查找对应的 node 是否存在

        //HashMap 底层维护了 EntrySet，KeySet，Values 三个内部类，通过这三个类实现对 HashMap 更高效的操作
        //entrySet 在创建对象时随之创建，而 keySet，values 则在调用时创建
        //  1.entrySet 本质是 Set，提供了对 node 操作的方法
        //  2.keySet 本质是 Set，提供了对 key 操作的方法
        //  3.values 本质是 Collection，提供了对 value 操作的方法
        //注意：三个类实际上并没有存入对象，只是提供了一系列操作 hashMap 的接口方法
        //  问：既然没有存入对象，那是如何实现在输出时包含对象呢
        //  答：toString 方法被重写，使用迭代器对 hashMap 完成遍历
    }
}
