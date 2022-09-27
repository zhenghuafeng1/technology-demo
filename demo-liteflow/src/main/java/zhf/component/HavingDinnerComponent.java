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
@LiteflowComponent("havingDinnerComponent")
public class HavingDinnerComponent extends NodeComponent {

    @Override
    public void process() throws Exception {
        PersonEntity person = this.getRequestData();
        log.info("我的名字是{}，我在吃饭！", person.getName());
        for (int i = 0; i < 5; i++) {
              log.info("嚼......");
              Thread.sleep(2000);
          }
    }
}