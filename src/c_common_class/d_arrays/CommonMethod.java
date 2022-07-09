package c_common_class.d_arrays;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

class CommonMethod {
    public static void main(String[] args) {
        //Arrays 是工具类，其所有的方法均为静态方法

        //1.toString：返回数组的字符串表示
        //2.sort：排序，分为默认排序和定制排序
        sort();
        //3.binarySearch：二分搜索，要求必须已经正序排序
        //  找到则返回 index
        //  未找到则返回一个负值（如果该数存在的话所在位置的 index + 1 再取反）
        //4.copyOf(T[] original, int newLength)：
        //  从原数组中取 newLength 个元素返回，如果 newLength > original.length，后续元素为 null
        //5.fill：将数组中的元素全部替换为传入的新元素
        //6.equals：比较两个数组内容是否一致
        //7.asList：将数组转换为 List 类型
        asList();
    }

    private static void sort() {
        //定制排序
        Integer[] arr = {9, 5, 3, 7, 0};
        Arrays.sort(
                arr,
                new Comparator<>() {
                    @Override
                    public int compare(Integer o1, Integer o2) {
                        return o2 - o1;
                    }
                });
        System.out.println(Arrays.toString(arr));
    }

    private static void asList() {
        //  编译类型 List
        //  运行类型 java.util.Arrays$ArrayList
        Integer[] arr = {9, 5, 3, 7, 0};
        List<Integer> list = Arrays.asList(arr);
        System.out.println(list.getClass());
    }
}
