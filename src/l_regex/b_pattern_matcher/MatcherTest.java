package l_regex.b_pattern_matcher;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

class MatcherTest {
    public static void main(String[] args) {
        String str = "123456";
        Pattern pattern = PatternTest.getPattern();

        //创建 Matcher 对象
        Matcher matcher = pattern.matcher(str);

        //1.matches()：是否匹配
        System.out.println(matcher.matches());
        //2.find()：是否有匹配子串
        System.out.println(matcher.find());
        //3.1.group()：匹配的字符串
        //3.2.group(int group)：指定组的匹配字符串
        //3.3.group(String group)：指定组的匹配字符串
        //搭配 find()：查找所有的匹配子串
        matcher.reset();
        while (matcher.find()) {
            System.out.println(matcher.group());
            System.out.println(matcher.group(1));
            System.out.println(matcher.group("d1"));
            System.out.println(matcher.group(2));
            System.out.println(matcher.group("d2"));
        }
        //4.1.start()：匹配子串的起始位置
        //4.2.start(int group)：指定组的匹配子串的起始位置
        //4.3.start(String group)：指定组的匹配子串的起始位置
        //5.1.end()：匹配子串的结束位置
        //5.2.end(int group)：指定组的匹配子串的结束位置
        //5.3.end(String group)：指定组的匹配子串的结束位置
        //6.replaceAll()：替换所有匹配子串
    }
}
