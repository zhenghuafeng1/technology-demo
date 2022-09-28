package zhf.api;

import zhf.entity.UserInfoEntity;
import zhf.enums.SexEnums;

/**
 * @Autor zhenghf
 * @Date 2022/9/26
 * @ClassName
 * @Customer
 **/
public interface UserInfoService {
    UserInfoEntity getUserInfo();
    SexEnums getUserSex(UserInfoEntity userInfo);
}
