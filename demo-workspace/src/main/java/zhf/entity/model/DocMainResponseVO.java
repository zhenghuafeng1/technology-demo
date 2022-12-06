package zhf.entity.model;

import lombok.Data;

/**
 * @Autor zhenghf
 * @Date 2022/12/6
 * @ClassName DocMainResponseVO
 * @Description
 * @Version 1.0
 **/
@Data
public class DocMainResponseVO {

    private String id;

    private String doc_code;

    private String doc_type;

    private String doc_name;

    private String parent_code;

    private String doc_order;

    private String doc_status;

}
