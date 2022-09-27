package zhf.service;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import zhf.TestApp;

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

    @Test
    public void autowireTest() {
        userInfoServicesList.forEach(userInfoServiceImpl -> {
            userInfoServiceImpl.getUser();
        });
    }

}
