package zhf.adapterPattern.service.impl;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import zhf.adapterPattern.enums.BuriedPointEnum;
import zhf.adapterPattern.service.BaseService;

import javax.annotation.PostConstruct;

/**
 * @Autor zhenghf
 * @Date 2022/11/16
 * @ClassName GooglAnalyticsServiceImpl
 * @Description
 * @Version 1.0
 **/
@Slf4j
@Service
public class GooglAnalyticsServiceImpl extends BaseService {

    @PostConstruct
    @Override
    public void init() {
        this.register();
    }

    @Override
    public String getNickName() {
        return BuriedPointEnum.GOOGL_ANALYTICS.getValue();
    }

    @Override
    public void processor() {
        log.info("this is GooglAnalyticsServiceImpl");
    }
}
