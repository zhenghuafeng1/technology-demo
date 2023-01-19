package zhf.enums;

import lombok.Getter;

/**
 * @Autor zhenghf
 * @Date 2023/1/5
 * @ClassName ResellerBillTaskStatusEnum
 * @Description
 * @Version 1.0
 **/
@Getter
public enum ResellerBillTaskStatusEnum {
    /**
     * 发布
     */
    PROCESSING("PROCESSING");

    private String value;

    ResellerBillTaskStatusEnum(String value) {
        this.value = value;
    }
}
