package e_exception.d_custom_exception;

//自定义异常
//1.继承 Exception 类或 RuntimeException 类，通常继承 RuntimeException 类
//2.可以通过 throw 手动抛出异常

class Test {
    public static void main(String[] args) {
        throw new CustomException("自定义异常");
    }
}
