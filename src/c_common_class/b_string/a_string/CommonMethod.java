package c_common_class.b_string.a_string;

class CommonMethod {
    public static void main(String[] args) {
        //在以下操作中原字符串均不变

        //1.equals：value[] 相同返回 true
        //2.equalsIgnoreCase：value[] 相同返回 true，忽略大小写
        //3.length：返回字符串长度
        //4.indexOf：返回第一个 ch 的索引，如未找到，则返回 -1
        //5.lastIndexOf：返回最后一个 ch 的索引，如未找到，则返回 -1
        //6.substring：截取指定范围的子串，左闭右开
        //7.toUpperCase：转换为大写字母
        //8.toLowerCase：转换为小写字母
        //9.concat：拼接字符串
        //10.replace：将字符串中所有的 "old" 替换为 "new"
        //11.split：将字符串以传入的字符串为标准分割为数个字符串数组
        //   注意：如要以\进行分割，则传入的参数为\\\\，因为java底层存储的形式仍采用了转义字符
        split();
        //12.toCharArray：转化为字符数组
        //13.compareTo：比较两个字符串的大小，可视为两字符串相减
        //   1.从前往后比较，如果有字符不相同，则返回字符相减
        //   2.如果直到某个字符串已经遍历结束都没有发现不同的字符，则返回字符串长度相减
        //14.format：静态方法，返回字符串 参数为格式字符串和参数 其中格式字符串可以存储进行复用
        format();
    }

    private static void split() {
        String ss = "s\\ss\\sss";
        String[] split = ss.split("\\\\");
        for (String s : split) {
            System.out.println(s);
        }
    }

    private static void format() {
        String formatString = "名字是：%s 年龄是：%d";
        System.out.println(String.format(formatString, "Dr", 18));
    }
}
