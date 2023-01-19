package zhf.service.impl;

import org.springframework.stereotype.Service;
import zhf.annotation.SetSex;
import zhf.entity.UserEntity;
import zhf.service.AbstractSetSex;
import zhf.service.BaseSetSexService;

/**
 * @Autor zhenghf
 * @Date 2022/12/23
 * @ClassName BoySetSexService
 * @Description
 * @Version 1.0
 **/
@Service
public class GirlSetSexService extends AbstractSetSex {
    @Override
    public void setSex(UserEntity userEntity) {
        this.setSexa("girl");
    }

    @Override
    public String getSex() {
        return this.getSexa();
    }
}
