package zhf.adapterPattern.service;

import lombok.extern.slf4j.Slf4j;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

/**
 * @Autor zhenghf
 * @Date 2022/11/16
 * @ClassName ParamSetHandler
 * @Description
 * @Version 1.0
 **/
@Slf4j
@Order(2)
@Component
public class ParamSetHandler extends AbstractDataHandler {
    @Override
    public void isMatch(String name) {
        log.info("this is ParamSetHandler isMatch" + name);
    }
}
