package zhf.adapterPattern.service;

import lombok.extern.slf4j.Slf4j;
import org.springframework.core.annotation.Order;

/**
 * @Autor zhenghf
 * @Date 2022/11/16
 * @ClassName ParamSetHandler
 * @Description
 * @Version 1.0
 **/
@Slf4j
@Order(2)
//@Component
public class ParamSetHandler extends AbstractDataHandler {
    @Override
    void handle(String nickName, String id) {
        log.info("this is ParamSetHandler");
    }
}
