package zhf.service.impl;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import zhf.entity.UserInfoEntity;
import zhf.enums.SexEnums;
import zhf.service.UserInfoService;

import javax.annotation.PostConstruct;
import java.util.HashMap;
import java.util.Map;

/**
 * @Autor zhenghf
 * @Date 2022/9/28
 * @ClassName UserInfoServiceImpl
 * @Description
 * @Version 1.0
 **/
@Slf4j
@Service
public class UserInfoServiceImpl implements UserInfoService {

    private static Map<String, UserInfoEntity> userInfoEntityMap = new HashMap<>();

    @PostConstruct
    public void initUserMap() {
        for (int i = 1; i <= 3; i++) {
            UserInfoEntity userInfo = new UserInfoEntity();
            userInfo.setName("name" + i);
            userInfo.setSex(SexEnums.BOY);
            userInfoEntityMap.put(String.valueOf(i), userInfo);
            log.info("init user name:{}", userInfo.getName());
        }
    }

    @Override
    public UserInfoEntity get(String id) {
        log.info("get userId:{}", id);
        return userInfoEntityMap.get(id);
    }

}
