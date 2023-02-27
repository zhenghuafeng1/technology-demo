package zhf.service.impl;

import org.springframework.stereotype.Component;
import zhf.service.BaseNameService;
import zhf.service.BaseSexService;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @Autor zhenghf
 * @Date 2023/2/15
 * @ClassName UserFactory
 * @Description
 * @Version 1.0
 **/
@Component
public class UserFactory {

    private Map<String, BaseNameService> baseNameServiceMap;
    private Map<String, BaseSexService> baseSexServiceMap;

    public UserFactory(List<BaseNameService> list1, List<BaseSexService> list2) {
        baseNameServiceMap = new HashMap<>();
        list1.forEach(baseResellerService -> baseNameServiceMap.put(baseResellerService.getName(), baseResellerService));

        baseSexServiceMap = new HashMap<>();
        list2.forEach(baseResellerService -> baseSexServiceMap.put(baseResellerService.getSex(), baseResellerService));
    }

    public Map getMap1() {
        return baseNameServiceMap;
    }
    public Map getMap2() {
        return baseSexServiceMap;
    }
}
