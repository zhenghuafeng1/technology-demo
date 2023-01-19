package zhf.entity.model;

import zhf.entity.ResellerOssInfoEntity;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.math.BigDecimal;
import java.util.List;

/**
 * @Autor zhenghf
 * @Date 2023/1/5
 * @ClassName ResellerPlatformInfoDto
 * @Description
 * @Version 1.0
 **/
public class ResellerPlatformInfoDto {
    @Id
    @GeneratedValue(generator = "JDBC")
    private Long id;

    private String resellerPlatformCode;

    private String resellerCode;

    private String resellerName;

    private String cloudPlatform;

    private String note;

    private String discountType;

    private BigDecimal discountRate;

    private String billSyncType;

    private List<ResellerOssInfoEntity> resellerOssInfoEntityList;
}
