package c_common_class.f_big;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.math.RoundingMode;

class Test {
    public static void main(String[] args) {
        bigInteger();
        bigDecimal();
    }

    private static void bigInteger() {
        // BigInteger：存储更大的整数
        BigInteger i1 = new BigInteger("999999999999999999999999999999999999999999999");
        BigInteger i2 = new BigInteger("2");

        System.out.println(i1.add(i2));
        System.out.println(i1.subtract(i2));
        System.out.println(i1.multiply(i2));
        System.out.println(i1.divide(i2));
    }

    private static void bigDecimal() {
        // BigDecimal：存储精度更高的浮点数
        BigDecimal d1 = new BigDecimal("1.1111111111111111111111111111111111111111111");
        BigDecimal d2 = new BigDecimal("9.9");

        System.out.println(d1.add(d2));
        System.out.println(d1.subtract(d2));
        System.out.println(d1.multiply(d2));
        //算数异常：如果除不尽就会报错
        //解决方法：增加参数 BigDecimal.ROUND_CEILING/RoundingMode.CEILING
        //         如果除不尽，结果的精度与被除数相同
        System.out.println(d1.divide(d2, BigDecimal.ROUND_CEILING));
        System.out.println(d1.divide(d2, RoundingMode.CEILING));
    }
}
