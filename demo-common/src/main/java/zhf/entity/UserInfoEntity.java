package zhf.entity;

import lombok.Data;
import zhf.enums.SexEnums;

/**
 * @Autor zhenghf
 * @Date 2022/9/26
 * @ClassName UserInfoEntity
 * @Description
 * @Version 1.0
 **/
@Data
public class UserInfoEntity {
    private String name;
    private SexEnums sex;
}
