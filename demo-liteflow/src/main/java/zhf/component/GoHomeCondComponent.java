package zhf.component;


import com.yomahub.liteflow.annotation.LiteflowComponent;
import com.yomahub.liteflow.core.NodeCondComponent;
import org.springframework.beans.factory.annotation.Autowired;
import zhf.service.TestService;

/**
 * @Autor zhenghf
 * @Date 2022/9/26
 * @ClassName GoHomeCondComponent
 * @Description
 * @Version 1.0
 **/
@LiteflowComponent("e")
public class GoHomeCondComponent extends NodeCondComponent {

    @Autowired
    private TestService testService;

    @Override
    public String processCond() throws Exception {
        testService.getTest();
        Class c2 = WatchTVComponent.class;
        return "washHandsComponent";
    }
}
