package zhf.component;

import com.yomahub.liteflow.core.FlowExecutor;
import com.yomahub.liteflow.flow.LiteflowResponse;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.AutoConfigureOrder;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import zhf.TestApp;
import zhf.entity.PersonEntity;
import zhf.enums.SexEnum;

import javax.annotation.Resource;

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

    @Autowired
    private FlowExecutor flowExecutor;

    @Test
    public void componentTest(){
        //创建一个人
        PersonEntity personEntity=new PersonEntity();
        personEntity.setName("zhf");
        personEntity.setSex(SexEnum.BOY);
        //执行回家流程
        LiteflowResponse goHome = flowExecutor.execute2Resp("goHome", personEntity);
    }
}
