package zhf.enums;

import lombok.Getter;

/**
 * @Autor zhenghf
 * @Date 2022/11/14
 * @ClassName MethodEnum
 * @Description
 * @Version 1.0
 **/
@Getter
public enum MethodEnum {
    GET("GET"),

    POST("POST");

    private String value;

    MethodEnum(String value) {
        this.value = value;
    }
}
