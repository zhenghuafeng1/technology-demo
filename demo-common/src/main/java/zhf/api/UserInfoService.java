package zhf.api;

import zhf.entity.UserInfoEntity;

/**
 * @Autor zhenghf
 * @Date 2022/9/26
 * @ClassName
 * @Customer
 **/
public interface UserInfoService {
    void getUserInfo();
    void getUserSex(UserInfoEntity userInfo);
}
