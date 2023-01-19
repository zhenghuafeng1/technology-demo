package zhf.component;

import com.yomahub.liteflow.core.FlowExecutor;
import com.yomahub.liteflow.flow.LiteflowResponse;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import zhf.TestApp;
import zhf.entity.PersonEntity;
import zhf.enums.SexEnum;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import static org.springframework.boot.test.context.SpringBootTest.WebEnvironment.NONE;

/**
 * @Autor zhenghf
 * @Date 2022/9/23
 * @ClassName ComponentTest
 * @Description
 * @Version 1.0
 **/
@RunWith(SpringRunner.class)
@SpringBootTest(classes = TestApp.class, webEnvironment = NONE)
public class ComponentTest {

    private static Pattern UNDERLINE_PATTERN = Pattern.compile("_([a-z])");

    @Autowired
    private FlowExecutor flowExecutor;

    @Test
    public void test2() {
        PersonEntity personEntity = new PersonEntity();
//        list.add("1");
//        list.add("2");
//        list.add("3");
        System.out.println(Objects.equals(personEntity, null));
    }

    @Test
    public void componentTest(){
        //创建一个人
        PersonEntity personEntity=new PersonEntity();
        personEntity.setName("zhf");
        personEntity.setSex(SexEnum.BOY);
        //执行回家流程
        LiteflowResponse goHome = flowExecutor.execute2Resp("goHome", personEntity);
    }

    @Test
    public void test() {
        System.out.println(underlineToHump("CREATE_NAME"));
    }
    public static String underlineToHump (String lowerLineAndUppercaseStr){
        String[] eachStr = lowerLineAndUppercaseStr.split("_");
        StringBuilder resStr = new StringBuilder();
        String firstStr = "";
        String tempStr = "";
        for (int i = 0; i < eachStr.length; i++) {
            //第一个数组全部小写
            if (i == 0) {
                firstStr = eachStr[0].toLowerCase();
                resStr.append(firstStr);
            } else {
                //以后的数组首字母大写
                tempStr = capitalizeTheFirstLetter(eachStr[i]);
                resStr.append(tempStr);
            }
        }

        return resStr.toString();
    }

    public static String capitalizeTheFirstLetter(String str) {
        char firstChar = str.toUpperCase().charAt(0);
        String nextStr = str.toLowerCase().substring(1);
        return firstChar + nextStr;
    }

}
