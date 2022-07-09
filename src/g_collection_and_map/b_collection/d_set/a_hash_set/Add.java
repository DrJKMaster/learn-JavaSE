package g_collection_and_map.b_collection.d_set.a_hash_set;

import java.util.HashSet;
import java.util.Set;

@SuppressWarnings("all")
class Add {
    public static void main(String[] args) {
        Set set1 = new HashSet();
        //使用 add 方法添加元素时，如果成功返回 true，如果失败返回 false
        //添加元素时
        //1.先获取其 hash 值并转化为索引
        //  这里使用的 hash 值并非 hashCode 值，而是对 hashCode 进行处理后获得的（为了防止地址冲突）
        //2.检查 table 中该索引所在的位置是否有元素
        //2.1.如果没有元素，直接添加
        //2.2.如果有元素，则调用 equals 方法比较，如果有相同元素则放弃添加，否则添加到链表末端
        //3.当某个链表满足一定条件，该链表将会红黑树化
        //  条件：链表的长度 >= 8，table 的容量 >= 64
        set1.add(0);
        System.out.println(set1);
        set1.add(1);
        System.out.println(set1);
        /*
        add

        1.boolean add(E e)
            HashSet 创建时，新建了一个 HashMap 对象，并通过 HashMap 对象的操作实现 HashSet 的功能
            调用 map 的 put(K key, V value)
            HashSet 不需要 value，因此 value 使用 (static) PRESENT = new Object() 替代

            public boolean add(E e) {
                return map.put(e, PRESENT)==null;
            }

        2.put(K key, V value)
            HashMap 对象的 put 方法，作用是将键值对添加到 HashMap 中
            调用 putVal(int hash, K key, V value, boolean onlyIfAbsent, boolean evict)
            hash 处传入的值为 hash(key)，与 key 的哈希值有关，用于确定其加入到 HashMap 时所处的位置
            key 与 value 即为要存储的键值对

            public V put(K key, V value) {
                return putVal(hash(key), key, value, false, true);
            }

        3.hash(Object key)
            根据 key 的 hashCode 确定其 hash 值
            hashCode 与此处的 hash 值不同
            如下操作可以防止地址冲突

            注意：
            如果 hashCode 和 equals 方法不被重写，则无法判断两个地址不同但值相同的对象是相同的
            因此两个对象会被认为是不同的对象，可以同时存在
            而 String 重写了 hashCode 和 equals 方法
            因此当两个 String 的 Value 相同时不能同时存在

            static final int hash(Object key) {
                int h;
                return (key == null) ? 0 : (h = key.hashCode()) ^ (h >>> 16);
            }

        4.putVal(int hash, K key, V value, boolean onlyIfAbsent, boolean evict)
            将键值对添加到 HashMap 中

            final V putVal(int hash, K key, V value, boolean onlyIfAbsent, boolean evict) {
                //一些中间变量
                Node<K,V>[] tab; Node<K,V> p; int n, i;
                //如果 table 为空或 table 的长度为 0，则调用 resize 方法重置 table 的长度
                if ((tab = table) == null || (n = tab.length) == 0)
                    n = (tab = resize()).length;
                //因为是第一个元素，插入的位置必定没有元素，所以直接插入到 tab[i] 位置
                if ((p = tab[i = (n - 1) & hash]) == null)
                    tab[i] = newNode(hash, key, value, null);
                else {
                    Node<K,V> e; K k;
                    //首先比较 hash 值是否相同，然后判断属性是否真的相同
                    //不同对象的 hash 值可能相同：地址冲突
                    //因为 equals 方法比较耗时，所以先判断 hash 是否相等，通过短路与加快运行速度
                    if (p.hash == hash &&
                        ((k = p.key) == key || (key != null && key.equals(k))))
                        e = p;
                    //判断 p 是否为红黑树，如果是红黑树，则调用 putTreeVal 方法添加节点
                    else if (p instanceof TreeNode)
                        e = ((TreeNode<K,V>)p).putTreeVal(this, tab, hash, key, value);
                    //其他情况，p 是链表的第一个结点
                    else {
                        for (int binCount = 0; ; ++binCount) {
                            if ((e = p.next) == null) {
                                p.next = newNode(hash, key, value, null);
                                if (binCount >= TREEIFY_THRESHOLD - 1) // -1 for 1st
                                    treeifyBin(tab, hash);
                                break;
                            }
                            if (e.hash == hash &&
                                ((k = e.key) == key || (key != null && key.equals(k))))
                                break;
                            p = e;
                        }
                    }
                    if (e != null) { // existing mapping for key
                        V oldValue = e.value;
                        if (!onlyIfAbsent || oldValue == null)
                            e.value = value;
                        afterNodeAccess(e);
                        return oldValue;
                    }
                }
                ++modCount;
                if (++size > threshold)
                    resize();
                //为其子类提供的方法，在 HashSet 中为空实现
                afterNodeInsertion(evict);
                return null;
            }

        5.resize()
            重设 table 的大小

            final Node<K,V>[] resize() {
                Node<K,V>[] oldTab = table;
                int oldCap = (oldTab == null) ? 0 : oldTab.length;
                int oldThr = threshold;
                int newCap, newThr = 0;
                if (oldCap > 0) {
                    if (oldCap >= MAXIMUM_CAPACITY) {
                        threshold = Integer.MAX_VALUE;
                        return oldTab;
                    }
                    else if ((newCap = oldCap << 1) < MAXIMUM_CAPACITY &&
                             oldCap >= DEFAULT_INITIAL_CAPACITY)
                        newThr = oldThr << 1; // double threshold
                }
                else if (oldThr > 0) // initial capacity was placed in threshold
                    newCap = oldThr;
                else {               // zero initial threshold signifies using defaults
                    //设置 newCap 为默认初始化容量 16
                    newCap = DEFAULT_INITIAL_CAPACITY;
                    //设置 newThr 为默认初始化容量 16 * 默认初始化加载因子 0.75 = 12
                    newThr = (int)(DEFAULT_LOAD_FACTOR * DEFAULT_INITIAL_CAPACITY);
                }
                if (newThr == 0) {
                    float ft = (float)newCap * loadFactor;
                    newThr = (newCap < MAXIMUM_CAPACITY && ft < (float)MAXIMUM_CAPACITY ?
                              (int)ft : Integer.MAX_VALUE);
                }
                //将 threshold 设置为 newThr = 12
                threshold = newThr;
                @SuppressWarnings({"rawtypes","unchecked"})
                //根据 newCap 创建 newTab 并替换原先的 table
                Node<K,V>[] newTab = (Node<K,V>[])new Node[newCap];
                table = newTab;
                if (oldTab != null) {
                    for (int j = 0; j < oldCap; ++j) {
                        Node<K,V> e;
                        if ((e = oldTab[j]) != null) {
                            oldTab[j] = null;
                            if (e.next == null)
                                newTab[e.hash & (newCap - 1)] = e;
                            else if (e instanceof TreeNode)
                                ((TreeNode<K,V>)e).split(this, newTab, j, oldCap);
                            else { // preserve order
                                Node<K,V> loHead = null, loTail = null;
                                Node<K,V> hiHead = null, hiTail = null;
                                Node<K,V> next;
                                do {
                                    next = e.next;
                                    if ((e.hash & oldCap) == 0) {
                                        if (loTail == null)
                                            loHead = e;
                                        else
                                            loTail.next = e;
                                        loTail = e;
                                    }
                                    else {
                                        if (hiTail == null)
                                            hiHead = e;
                                        else
                                            hiTail.next = e;
                                        hiTail = e;
                                    }
                                } while ((e = next) != null);
                                if (loTail != null) {
                                    loTail.next = null;
                                    newTab[j] = loHead;
                                }
                                if (hiTail != null) {
                                    hiTail.next = null;
                                    newTab[j + oldCap] = hiHead;
                                }
                            }
                        }
                    }
                }
                return newTab;
            }
         */
    }
}
