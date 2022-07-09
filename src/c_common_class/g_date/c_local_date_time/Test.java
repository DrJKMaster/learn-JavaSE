package c_common_class.g_date.c_local_date_time;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

//第三代
class Test {
    public static void main(String[] args) {
        //LocalDate：年月日
        //LocalTime：时分秒
        //LocalDateTime：年月日时分秒
        LocalDateTime now = LocalDateTime.now();
        System.out.println(now);
        System.out.println(now.getYear());
        System.out.println(now.getMonth());
        System.out.println(now.getMonthValue());
        System.out.println(now.getDayOfMonth());
        System.out.println(now.getHour());
        System.out.println(now.getMinute());
        System.out.println(now.getSecond());

        //格式化输出
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy年MM月dd日 HH:mm:ss");
        System.out.println(formatter.format(now));

        //Plus Minus 方法用于加减（原时间不变）
        System.out.println(now.plusDays(1).getDayOfMonth());
        System.out.println(now.minusDays(1).getDayOfMonth());
        System.out.println(now.getDayOfMonth());
    }
}
