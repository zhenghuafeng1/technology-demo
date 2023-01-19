package zhf.service;

import zhf.annotation.SetSex;
import zhf.entity.UserEntity;

/**
 * @Autor zhenghf
 * @Date 2022/12/23
 * @ClassName BaseSetSexService
 * @Description
 * @Version 1.0
 **/
public interface BaseSetSexService {

    void setSex(UserEntity userEntity);

    String getSex();
}
