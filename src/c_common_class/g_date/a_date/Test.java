package c_common_class.g_date.a_date;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

//第一代
class Test {
    public static void main(String[] args) throws ParseException {
        //构造器
        //1.Date()：获取当前时间
        Date date1 = new Date();
        //2.Date(long date)：根据时间戳确定时间
        Date date2 = new Date(1);

        System.out.println(date1); //根据标准格式显示时间
        System.out.println(date1.getTime()); //显示时间戳

        //Date -> String
        SimpleDateFormat format = new SimpleDateFormat("yyyy年MM月dd日 HH:mm:ss E");
        String dateString = format.format(date1);
        System.out.println(dateString);

        //String -> Date
        Date parse = format.parse(dateString);
        System.out.println(format.format(parse));
    }
}
