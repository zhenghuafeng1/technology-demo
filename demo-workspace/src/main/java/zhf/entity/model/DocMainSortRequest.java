package zhf.entity.model;

import lombok.Builder;
import lombok.Data;

/**
 * @Autor zhenghf
 * @Date 2022/12/6
 * @ClassName DocMainSortRequest
 * @Description
 * @Version 1.0
 **/
@Builder
@Data
public class DocMainSortRequest {

    private String currentCode;
    private String previousCode;
    private String nextCode;
}
