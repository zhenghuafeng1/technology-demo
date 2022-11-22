package zhf.adapterPattern.service;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

/**
 * @Autor zhenghf
 * @Date 2022/11/16
 * @ClassName DataSaveHandler
 * @Description
 * @Version 1.0
 **/
@Slf4j
@Order(99)
@Component
public class DataSaveHandler extends AbstractDataHandler {

    @Value("${handler.save_data}")
    private boolean saveData;

    @Override
    public void isMatch(String name) {
        if (saveData) {
            log.info("this is DataSaveHandler isMatch" + name);
        }
    }
}
