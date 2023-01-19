package zhf.service;

import zhf.entity.UserEntity;

/**
 * @Autor zhenghf
 * @Date 2022/12/23
 * @ClassName AbstractSetSex
 * @Description
 * @Version 1.0
 **/
public abstract class AbstractSetSex implements BaseSetSexService{

    private String sex;

    public void setSexa(String sex) {
        this.sex = sex;
    }

    public String getSexa() {
        return this.sex;

    }
}
