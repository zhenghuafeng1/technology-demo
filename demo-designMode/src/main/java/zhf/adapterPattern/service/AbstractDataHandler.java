package zhf.adapterPattern.service;

import lombok.extern.slf4j.Slf4j;

/**
 * @Autor zhenghf
 * @Date 2022/11/16
 * @ClassName AbstractDataHandler
 * @Description
 * @Version 1.0
 **/
@Slf4j
public abstract class AbstractDataHandler implements IDataHandler {

    @Override
    public void handle(String nickName) {
        log.info("this is AbstractDataHandler");
    }

}
