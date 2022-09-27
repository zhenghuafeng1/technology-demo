package zhf.service.impl;

import org.springframework.stereotype.Service;
import zhf.entity.UserInfoEntity;
import zhf.service.UserInfoService;

/**
 * @Autor zhenghf
 * @Date 2022/9/26
 * @ClassName BoyUserInfoServiceImpl
 * @Description
 * @Version 1.0
 **/
@Service
public class BoyUserInfoServiceImpl implements UserInfoService {
    @Override
    public void getUser() {
        System.out.println("this is boy");
    }
}
