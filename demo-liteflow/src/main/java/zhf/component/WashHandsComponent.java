package zhf.component;

import com.yomahub.liteflow.annotation.LiteflowComponent;
import com.yomahub.liteflow.core.NodeComponent;
import lombok.extern.slf4j.Slf4j;
import zhf.entity.PersonEntity;

/**
 * @Autor zhenghf
 * @Date 2022/9/23
 * @ClassName HavingDinnerComponent
 * @Description
 * @Version 1.0
 **/
@Slf4j
@LiteflowComponent("washHandsComponent")
public class WashHandsComponent extends NodeComponent {

    @Override
    public void process() throws Exception {
        PersonEntity person = this.getRequestData();
        log.info("我的名字是{}，我爱干净，我在洗手！",person.getName());
    }
}
