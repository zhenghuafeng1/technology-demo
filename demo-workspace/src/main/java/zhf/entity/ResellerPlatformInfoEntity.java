package zhf.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import java.math.BigDecimal;

/**
 * @Autor zhenghf
 * @Date 2023/1/5
 * @ClassName ResellerPlatformInfoEntity
 * @Description
 * @Version 1.0
 **/
@Entity
@Table(name = "reseller_platform_info")
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class ResellerPlatformInfoEntity {
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
}
