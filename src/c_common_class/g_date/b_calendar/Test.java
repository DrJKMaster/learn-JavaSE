package c_common_class.g_date.b_calendar;

import java.util.Calendar;

//第二代
class Test {
    public static void main(String[] args) {
        //Calendar 是抽象类，并且构造器为 protected，需要通过 getInstance 获取实例

        Calendar calendar = Calendar.getInstance();
        System.out.println(calendar);
        System.out.println(calendar.get(Calendar.YEAR));
        //获取 MONTH 需要 + 1，因为 Calendar 从 0 开始计算月份
        System.out.println(calendar.get(Calendar.MONTH) + 1);
        System.out.println(calendar.get(Calendar.DAY_OF_MONTH));
        System.out.println(calendar.get(Calendar.HOUR_OF_DAY));
        System.out.println(calendar.get(Calendar.MINUTE));
        System.out.println(calendar.get(Calendar.SECOND));
    }
}
