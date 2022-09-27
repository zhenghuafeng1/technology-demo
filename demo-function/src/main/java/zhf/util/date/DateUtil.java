package zhf.util.date;

import lombok.extern.slf4j.Slf4j;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

/**
 * @Autor zhenghf
 * @Date 2022/9/27
 * @ClassName DateUtil
 * @Description
 * @Version 1.0
 **/
@Slf4j
public class DateUtil {

    /**
     * 获取指定日期之间所有日期（包含指定日期）
     * @param startTime 开始日期yyyy-MM-dd
     * @param endTime 截止日期yyyy-MM-dd
     * @return
     */
    public static List<String> getBetweenDate(String startTime, String endTime){
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        // 声明保存日期集合
        List<String> list = new ArrayList<String>();
        try {
            // 转化成日期类型
            Date startDate = sdf.parse(startTime);
            Date endDate = sdf.parse(endTime);

            //用Calendar 进行日期比较判断
            Calendar calendar = Calendar.getInstance();
            while (startDate.getTime()<=endDate.getTime()){
                // 把日期添加到集合
                list.add(sdf.format(startDate));
                // 设置日期
                calendar.setTime(startDate);
                //把日期增加一天
                calendar.add(Calendar.DATE, 1);
                // 获取增加后的日期
                startDate=calendar.getTime();
            }
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return list;
    }

    public static void main(String[] args) {
       getBetweenDate("2021-09-27", "2022-09-27").forEach(date-> {
           log.info(date);
       });
    }

}
