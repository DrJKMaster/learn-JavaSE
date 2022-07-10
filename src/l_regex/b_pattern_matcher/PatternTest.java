package l_regex.b_pattern_matcher;

import java.util.regex.Pattern;

class PatternTest {
    private static final String regStr = "(?<d1>\\d{2})(?<d2>\\d)";

    public static void main(String[] args) {
        //1.matches()：是否匹配
        String str = "123456";
        boolean matches = Pattern.matches(regStr, str);
        System.out.println(matches);
    }

    public static Pattern getPattern() {
        //返回 Pattern 对象
        return Pattern.compile(regStr);
        //返回 Pattern 对象，忽略大小写
        //return Pattern.compile(regStr, Pattern.CASE_INSENSITIVE);
    }
}
