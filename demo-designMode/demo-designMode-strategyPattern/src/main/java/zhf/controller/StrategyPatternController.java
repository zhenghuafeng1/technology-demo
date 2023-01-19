package zhf.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import zhf.entity.UserEntity;
import zhf.service.BaseSetSexService;
import zhf.service.impl.SetSexConfig;

import java.util.Map;

/**
 * @Autor zhenghf
 * @Date 2022/12/23
 * @ClassName StrategyPatternController
 * @Description
 * @Version 1.0
 **/
@RestController
@RequestMapping("/designMode/strategyPattern")
public class StrategyPatternController {

    @Autowired
    private Map<String, BaseSetSexService> stringBaseSetSexServiceMap;

    @Autowired
    private SetSexConfig setSexConfig;

    @GetMapping("/getUser/{sex}")
    public UserEntity getUser(@PathVariable("sex") String sex) {
        UserEntity userEntity = new UserEntity();
        BaseSetSexService baseSetSexService = stringBaseSetSexServiceMap.get(sex);
        baseSetSexService.setSex(userEntity);
        return userEntity;
    }
    @GetMapping("/getSex/{service}")
    public String getSex(@PathVariable("service") String service) {
        BaseSetSexService baseSetSexService = stringBaseSetSexServiceMap.get(service);
        setSexConfig.init(baseSetSexService);
        return baseSetSexService.getSex();
    }
}
