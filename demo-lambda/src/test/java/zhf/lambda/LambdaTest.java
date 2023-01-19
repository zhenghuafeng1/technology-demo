package zhf.lambda;

import org.assertj.core.util.Lists;
import org.junit.Test;
import org.junit.platform.commons.util.StringUtils;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import zhf.TestApp;
import zhf.entity.UserInfo;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.List;
import java.util.logging.SimpleFormatter;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

import static org.springframework.boot.test.context.SpringBootTest.WebEnvironment.NONE;

/**
 * @Autor zhenghf
 * @Date 2022/9/26
 * @ClassName LambdaTest
 * @Description
 * @Version 1.0
 **/
@RunWith(SpringRunner.class)
@SpringBootTest(classes = TestApp.class, webEnvironment = NONE)
public class LambdaTest {

    @Test
    public void test() {
//        String path = "https://cre-1316163810.cos.ap-nanjing.myqcloud.com/cre/L3-bill_details-*{billTime}*.csv";
//        if (StringUtils.isBlank(path)) {
//            System.out.println("path is null");
//            return;
//        }
//        path = path.replaceAll("https://", "");
//        String[] pathArray = path.split(".myqcloud.com");
//        String[] split = pathArray[0].split(".cos.");
//        System.out.println(split[split.length - 1]);

//        if (StringUtils.isBlank(path)) {
//            System.out.println("path is null");
//            return;
//        }
//        path = path.replaceAll("https://", "");
//        String[] pathArray = path.split(".cos.");
//        System.out.println(pathArray[0]);

        // 1.先验证url开始部分 https:// 或 http://
        // 2.通过((http|https)://)([\w-]+\.)+[\w$]+ 匹配域名www.bilibili.com
        // 3.(\/[\w-?=&./]*)? 匹配 /video/BV1Eq4y1E79W?from=search&seid
//        String regex = "^((https|http|ftp|rtsp|mms)?:\\/\\/)(.*\\.cos.*)(.*\\.myqcloud.com.*)(\\/)(.*)(\\/)(.*\\.csv)";
//        System.out.println(path.matches(regex));

//        UserInfo userInfo = new UserInfo();
//        userInfo.setName("111222333444");
//
//        getName1(userInfo.getName());
//        getName2(userInfo.getName());
//        System.out.println(userInfo);
        String path = "zheng,hua,feng";
        path.split(",");
        List<String> objects = Lists.newArrayList(Arrays.asList(path.split(",")));
        for (String str : objects) {
            System.out.println(str);
        }

    }

    public Date getNextSyncNext(Date date, String syncCycle) {
        Calendar calendar = new GregorianCalendar();
        calendar.setTime(date);
        if ("day".equals(syncCycle)) {
            calendar.add(Calendar.DATE, 1);
        }
        else {
            calendar.set(Calendar.DAY_OF_MONTH,1);
            calendar.add(Calendar.MONTH, 1);
        }
        return calendar.getTime();
    }

    public Date getLastDay(Date date) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        calendar.add(Calendar.DAY_OF_MONTH, -1);
        return calendar.getTime();
    }

    public Date getLastMonth(Date date) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        calendar.add(Calendar.MONTH,-1);
        return calendar.getTime();
    }

    public String getName1(String name) {
        name = name.replaceAll("444","");
        System.out.println(name);
        return name;
    }

    public String getName2(String name) {
        name = name.replaceAll("333","");
        System.out.println(name);
        return name;
    }
}
