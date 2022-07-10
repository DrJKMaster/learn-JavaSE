package l_regex.c_back_references;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

class Test {
    public static void main(String[] args) {
        d2();
        d5();
        d13d24();
        UnDuplicate();
    }

    private static void d2() {
        // 匹配两个连续相同的数字
        String str = "12334567789";
        String regex = "(\\d)(\\1)";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(str);
        while (matcher.find()) {
            System.out.println(matcher.group());
        }
    }

    private static void d5() {
        // 匹配五个连续相同的数字
        String str = "12333334567777789";
        String regex = "(\\d)(\\1){4}";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(str);
        while (matcher.find()) {
            System.out.println(matcher.group());
        }
    }

    private static void d13d24() {
        // 匹配四个连续的数字，第一位和第四位相同，第二位和第三位相同
        String str = "1233455467789";
        String regex = "(\\d)(\\d)(\\2)(\\1)";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(str);
        while (matcher.find()) {
            System.out.println(matcher.group());
        }
    }

    private static void UnDuplicate() {
        //结巴去重
        String str = "我....我要....学学学学....编程java!";

        //1.去除所有的 .
        String regex = "\\.";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(str);
        str = matcher.replaceAll("");

        //2.去重
        regex = "(.)\\1+";
        pattern = Pattern.compile(regex);
        matcher = pattern.matcher(str);
        str = matcher.replaceAll("$1");

        System.out.println(str);
    }
}
