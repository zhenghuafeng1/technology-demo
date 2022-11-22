package zhf.adapterPattern.service;

import lombok.extern.slf4j.Slf4j;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

/**
 * @Autor zhenghf
 * @Date 2022/11/16
 * @ClassName TurnLogHandler
 * @Description
 * @Version 1.0
 **/
@Slf4j
@Order(1)
@Component
public class TurnLogHandler extends AbstractDataHandler {
    @Override
    public void isMatch(String name) {
        log.info("this is TurnLogHandler isMatch" + name);
        try {
            throw new RuntimeException("eeeeeeeeeeeeee");
        }
        catch (Exception e) {
            log.error(e.getMessage(), e);
        }

    }
}
