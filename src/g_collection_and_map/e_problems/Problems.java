package g_collection_and_map.e_problems;

import java.util.HashSet;

class Problems {
    public static void main(String[] args) {

        HashSet<Person> hashSet = new HashSet<>();
        Person p1 = new Person(1001, "AA");
        Person p2 = new Person(1002, "BB");
        hashSet.add(p1);
        hashSet.add(p2);
        System.out.println(hashSet);

        p1.name = "CC";
        hashSet.remove(p1);
        System.out.println(hashSet);
        //对 p1 作修改后删除 p1，失败
        //原因：
        //调用 remove 方法时，比较 p1 的 hashCode 与存入时 p1 的 hashCode，两数不匹配，因而无法删除

        hashSet.add(new Person(1001, "CC"));
        System.out.println(hashSet);
        //添加成功
        //原因：
        //尽管该 Person 对象与 p1 相同
        //但 p1 对象所对应的节点的 hash 值仍为 (1001, "AA") 的 hash 值，因此可添加

        hashSet.add(new Person(1001, "AA"));
        System.out.println(hashSet);
        //添加成功
        //原因：
        //该 Person 对象与 p1 被修改前相同，因此 hash 判断相同
        //但在这之后还要进行 equals 判断，发现不同，因此还是会加入，并且与 p1 在同一个链表或红黑树里
    }
}
