package zhf.adapterPattern.enums;

import lombok.Getter;

/**
 * @Autor zhenghf
 * @Date 2022/11/16
 * @ClassName BuriedPointEnum
 * @Description
 * @Version 1.0
 **/
@Getter
public enum BuriedPointEnum {
    GOOGL_ANALYTICS("GooglAnalytics"),
    MATOMO("Matomo"),
    SAVE("Save");

    private String value;

    BuriedPointEnum(String value) {
        this.value = value;
    }
}
