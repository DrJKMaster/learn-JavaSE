package c_common_class.b_string.a_string;

class Problem {
    private String str = new String("hsp");
    private final char[] ch = {'j', 'a', 'v', 'a'};

    public static void main(String[] args) {
        Problem ex = new Problem();
        ex.change(ex.str, ex.ch);
        System.out.print(ex.str + " and ");
        System.out.println(ex.ch);
        //输出为"hsp and hava"
        //原因：
        //  调用 change 方法时 str 指向 ex.str，之后又使 str 指向 "java"
        //  change 方法结束后，ex.str 指向的 String 对象没有被改变（也无法改变）
    }

    private void change(String str, char[] ch) {
        str = "java";
        ch[0] = 'h';
    }
}
