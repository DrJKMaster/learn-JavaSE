package e_exception.a_basic_rules;

class Test {
    public static void main(String[] args) {
        int n1 = 10;
        int n2 = 0;
        //通过 try/catch 可以使程序在出错的情况下继续运行
        try {
            //如果只有这一行，则程序会报错然后结束运行
            int result = n1 / n2;
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("出现异常  " + e.getMessage());
        }
        System.out.println("继续运行");
    }
}
