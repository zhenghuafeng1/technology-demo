package zhf.adapterPattern.service;

import lombok.extern.slf4j.Slf4j;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;
import zhf.adapterPattern.enums.BuriedPointEnum;

import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;

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

    private ConcurrentHashMap<String, BaseService> baseServicePool = new ConcurrentHashMap<>();

    public void addService(String nickName, BaseService baseService) {
        baseServicePool.put(nickName, baseService);
    }

    public BaseService getService(String nickName) {
        return baseServicePool.get(nickName);
    }

    @Override
    public void handle(String nickName, String id) {
        log.info("this is DataSaveHandler");
        List<String> nickNames = new LinkedList<>();
        nickNames.add(BuriedPointEnum.GOOGL_ANALYTICS.getValue());
        nickNames.add(BuriedPointEnum.MATOMO.getValue());
        nickNames.add(BuriedPointEnum.MATOMO.getValue());
        nickNames.add(BuriedPointEnum.MATOMO.getValue());
        nickNames.add(BuriedPointEnum.SAVE.getValue());
        nickNames.add("Other");

        nickNames.forEach(e -> {
            if (getService(e) != null) {
                getService(e).processor();
            }
            else {
                log.error("service is null");
            }
        });
    }
}
