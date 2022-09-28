package zhf.service;

import zhf.entity.UserInfoEntity;

/**
 * @Autor zhenghf
 * @Date 2022/9/28
 * @ClassName UserInfoService
 * @Description
 * @Version 1.0
 **/
public interface UserInfoService {
    UserInfoEntity get(String id);
}
