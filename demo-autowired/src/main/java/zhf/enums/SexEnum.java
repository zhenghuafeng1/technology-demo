package zhf.enums;

import lombok.Getter;

import java.util.Map;
import java.util.TreeMap;

/**
 * @Autor zhenghf
 * @Date 2023/2/15
 * @ClassName SexEnum
 * @Description
 * @Version 1.0
 **/
@Getter
public enum SexEnum {
    AWS("AWS", 1),
    GCP("GCP", 1),
    AZURE("Azure", 1),
    ALIBABA("Alibaba", 5),
    TENCENT("Tencent", 3);

    private int monthSynDate;
    private String value;
    private static Map<String, SexEnum> resellerCloudPlatformEnum;

    SexEnum(String value, int monthSynDate) {
        this.value = value;
        this.monthSynDate = monthSynDate;
    }

    public static SexEnum getResellerCloudPlatformEnum(String cloudPlatform) {
        return resellerCloudPlatformEnum.get(cloudPlatform);
    }

    static {
        resellerCloudPlatformEnum = new TreeMap<>(String.CASE_INSENSITIVE_ORDER);
        for (SexEnum item : SexEnum.values()) {
            resellerCloudPlatformEnum.put(item.getValue(), item);
        }
    }
}
