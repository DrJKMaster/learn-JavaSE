package c_common_class.a_wrapper.a_basic;

class CharacterTest {
    public static void main(String[] args) {
        //常用方法
        //判断传入的字符是否为数字
        System.out.println(Character.isDigit('1'));
        System.out.println(Character.isDigit('a'));
        //判断传入的字符是否为字母
        System.out.println(Character.isLetter('1'));
        System.out.println(Character.isLetter('a'));
        //判断传入的字符是否为大写字母
        System.out.println(Character.isUpperCase('A'));
        System.out.println(Character.isUpperCase('a'));
        //判断传入的字符是否为小写字母
        System.out.println(Character.isLowerCase('A'));
        System.out.println(Character.isLowerCase('a'));
        //判断传入的字符是否为空格
        System.out.println(Character.isWhitespace('a'));
        System.out.println(Character.isWhitespace(' '));
        //将传入的字符转为大写
        System.out.println(Character.toUpperCase('a'));
        //将传入的字符转为小写
        System.out.println(Character.toLowerCase('A'));
    }
}
