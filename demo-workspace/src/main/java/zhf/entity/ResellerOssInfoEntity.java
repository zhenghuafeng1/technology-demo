package zhf.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import java.sql.Date;

/**
 * @Autor zhenghf
 * @Date 2023/1/5
 * @ClassName ResellerOssInfoEntity
 * @Description
 * @Version 1.0
 **/
@Entity
@Table(name = "reseller_oss_info")
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class ResellerOssInfoEntity {
    @Id
    @GeneratedValue(generator = "JDBC")
    private Long id;

    private String resellerPlatformCode;

    private String accessKey;

    private String secretKey;

    private String endpoint;

    private String dailyAddress;

    private String monthlyAddress;

    private Date modifyTime;

    private Date createTime;
}
