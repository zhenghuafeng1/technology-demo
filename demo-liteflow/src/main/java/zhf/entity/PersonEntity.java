package zhf.entity;

import lombok.Data;
import zhf.enums.SexEnum;

/**
 * @Autor zhenghf
 * @Date 2022/9/23
 * @ClassName Person
 * @Description
 * @Version 1.0
 **/
@Data
public class PersonEntity {

    private String name;
    private SexEnum sex;
}
