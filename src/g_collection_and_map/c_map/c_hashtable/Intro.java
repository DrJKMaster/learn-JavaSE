package g_collection_and_map.c_map.c_hashtable;

import java.util.Hashtable;

@SuppressWarnings("all")
class Intro {
    public static void main(String[] args) {
        //继承了 Dictionary 类，
        //key 与 value 都不允许为 null（空指针异常）
        //线程安全
        //table 表中存储了 Entry 接口对象
        //Entry 类为 Hashtable 的内部类，即 Hashtable$Entry，其实现了 Map$Entry 接口
        //TreeNode 类为 HashMap 的内部类，即 HashMap$TreeNode，其实现了 Map$Entry 接口

        //构造器：初始化容量为 11，加载因子为 0.75
        //1.Hashtable()
        Hashtable hashtable = new Hashtable();

        //每次扩容时扩容到 原先容量 * 2 + 1
    }
}
