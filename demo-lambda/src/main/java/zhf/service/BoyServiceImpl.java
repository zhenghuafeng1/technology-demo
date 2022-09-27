package zhf.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import zhf.api.UserInfoService;
import zhf.entity.UserInfoEntity;

import java.util.Arrays;
import java.util.List;

/**
 * @Autor zhenghf
 * @Date 2022/9/26
 * @ClassName BoyServiceImpl
 * @Description
 * @Version 1.0
 **/
@Service
public class BoyServiceImpl implements UserInfoService {

    @Override
    public void getUserInfo() {

    }

    @Override
    public void getUserSex(UserInfoEntity userInfo) {

    }

    public void test(){
        List<String> al = Arrays.asList("a", "b", "c", "d");
        al.forEach(UserInfoEntity::sayHello);
    }
}
