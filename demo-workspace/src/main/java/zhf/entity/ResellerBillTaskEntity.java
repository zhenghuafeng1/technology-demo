package zhf.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

/**
 * @Autor zhenghf
 * @Date 2023/1/5
 * @ClassName ResellerBillTaskEntity
 * @Description
 * @Version 1.0
 **/
@Entity
@Table(name = "reseller_bill_task")
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class ResellerBillTaskEntity {
    @Id
    @GeneratedValue(generator = "JDBC")
    private Long id;

    private String billTaskCode;

    private String resellerPlatformCode;

    private String syncCycle;

    private Date lastSyncTime;

    private Date nextSyncNext;

    private String syncStatus;

    private Date createTime;

    private Date modifyTime;
}
