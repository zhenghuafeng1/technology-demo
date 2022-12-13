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
 * @Date 2022/12/6
 * @ClassName DocMainEntity
 * @Description
 * @Version 1.0
 **/
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
@Table(name = "doc_main")
public class DocMainEntity {
    /**
     * 唯一标识
     */
    @Id
    @GeneratedValue(generator = "JDBC")
    private Long id;

    private String docCode;

    private String docType;

    private String docName;

    private String parentCode;

    private BigDecimal docOrder;

    private String docStatus;

}
