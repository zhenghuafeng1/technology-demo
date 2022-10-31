package zhf.entity;

import lombok.Getter;
import org.springframework.util.StringUtils;

/**
 * @Autor zhenghf
 * @Date 2022/10/31
 * @ClassName PlatformEnum
 * @Description
 * @Version 1.0
 **/
@Getter
public enum PlatformEnum {

    /**
     * 平台标识
     */
    OPENSTACK("openstack"),
    APSARA("apsara"),
    ZSTACK("zstack");

    private String value;

    PlatformEnum(String value) {
        this.value = value;
    }

    public static PlatformEnum getPlatform(String platform) {

        if (StringUtils.isEmpty(platform)) {
            return null;
        }
        for (PlatformEnum item : values()) {
            if (platform.equalsIgnoreCase(item.getValue())) {
                return item;
            }
        }
        return null;
    }
}
