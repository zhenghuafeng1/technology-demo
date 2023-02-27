package zhf.service;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import zhf.TestApp;
import zhf.enums.SexEnum;
import zhf.service.impl.UserFactory;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.List;

import static org.springframework.boot.test.context.SpringBootTest.WebEnvironment.NONE;

/**
 * @Autor zhenghf
 * @Date 2022/9/26
 * @ClassName AutowiredListTest
 * @Description
 * @Version 1.0
 **/
@RunWith(SpringRunner.class)
@SpringBootTest(classes = TestApp.class, webEnvironment = NONE)
public class AutowiredListTest {

    @Autowired
    private List<UserInfoService> userInfoServicesList;

    @Autowired
    private UserFactory userFactory;

    @Test
    public void autowireTest() {
        userInfoServicesList.forEach(userInfoServiceImpl -> {
            userInfoServiceImpl.getUser();
        });
    }

    @Test
    public void enumTest() {

        switch (SexEnum.getResellerCloudPlatformEnum("Alibaba11")) {
            case AWS:
                System.out.println("AWS");
                break;
            case ALIBABA:
                System.out.println("ALIBABA");
                break;
            default:
                System.out.println("=====");
                break;
        }

    }

    @Test
    public void test1() {

        Calendar end = new GregorianCalendar();
        end.setTime(new Date());
        end.add(Calendar.MONTH, -1);
        end.set(Calendar.DAY_OF_MONTH, end.getActualMaximum(Calendar.DAY_OF_MONTH));

        Calendar begin = new GregorianCalendar();
        begin.setTime(new Date());
        begin.add(Calendar.MONTH, -1);
        begin.set(Calendar.DAY_OF_MONTH, 0);

        List<Date> dateList = new ArrayList<>();

        while (end.getTime().after(begin.getTime())) {
            begin.add(Calendar.DAY_OF_MONTH, 1);
            dateList.add(begin.getTime());
        }
        System.out.println(dateList);
    }

    /**
     * @author zhenghf
     * @date 2023/1/18
     * @description 获取上一个月份
     * @param date
     * @return Date
     */
    public Date getLastMonth(Date date) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        calendar.add(Calendar.MONTH, -1);
        return calendar.getTime();
    }

    @Test
    public void test2() throws Exception{
        String today = "2023-02-02 12:00:00";
        List<Date> betweenDates = getBetweenDates(new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").parse(today));
        for (Date date : betweenDates) {
            System.out.println(date);
        }
    }

    private List<Date> getBetweenDates(Date endDate) {
        List<Date> result = new ArrayList<>();
        Calendar tempStart = new GregorianCalendar();
        tempStart.setTime(endDate);
        tempStart.add(Calendar.DAY_OF_MONTH, -1);
        tempStart.set(Calendar.DAY_OF_MONTH, tempStart.getActualMinimum(Calendar.DAY_OF_MONTH));

        Calendar tempEnd = new GregorianCalendar();
        tempEnd.setTime(endDate);
        while (tempStart.before(tempEnd)) {
            result.add(tempStart.getTime());
            tempStart.add(Calendar.DAY_OF_YEAR, 1);
        }
        return result;
    }

}
