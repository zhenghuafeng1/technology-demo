package zhf.entity.model;

import lombok.Builder;
import lombok.Data;
import zhf.entity.DocMainEntity;

import java.util.List;

/**
 * @Autor zhenghf
 * @Date 2022/12/6
 * @ClassName DocMainListResponseVo
 * @Description
 * @Version 1.0
 **/
@Builder
@Data
public class DocMainListResponseVO {

    private List<DocMainEntity> docMainList;

}
