package g_collection_and_map.b_collection.b_iterator_and_for;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

class Test {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("s1");
        list.add("s2");
        list.add("s3");
        testFor(list);
        testIterator(list);
    }

    private static void testFor(List<String> list) {
        for (String s : list) {
            System.out.println(s);
        }
    }

    private static void testIterator(List<String> list) {
        Iterator<String> iterator = list.iterator();
        //iterator.hasNext()：如果存在下一个元素，则返回 True
        while (iterator.hasNext()) {
            //iterator.next()：指针向下移一位，并返回移动后指针所指的元素
            System.out.println(iterator.next());
        }
    }
}
