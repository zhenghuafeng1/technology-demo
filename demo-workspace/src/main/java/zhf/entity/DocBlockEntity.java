package zhf.entity;

import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @Autor zhenghf
 * @Date 2022/12/6
 * @ClassName DocBlockEntity
 * @Description
 * @Version 1.0
 **/
@Data
@Entity
@Table(name = "doc_block")
public class DocBlockEntity {
    /**
     * 唯一标识
     */
    @Id
    @GeneratedValue(generator = "JDBC")
    private String id;

    private String block_code;

    private String doc_code;

    private String parent_code;

    private String block_type;

    private String block_content;

    private String block_staus;

    private String block_order;
}
