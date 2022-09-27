package zhf.lambda;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import zhf.TestApp;
import zhf.entity.UserInfoEntity;
import zhf.service.BoyServiceImpl;

import java.util.Arrays;
import java.util.List;

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

    @Autowired
    private BoyServiceImpl service;

    @Test
    public void lambdaTest(){
        service.test();
    }
}
