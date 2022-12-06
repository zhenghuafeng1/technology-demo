package zhf.service;

import zhf.entity.model.DocMainListResponseVO;
import zhf.entity.model.DocMainSortRequest;

/**
 * @Autor zhenghf
 * @Date 2022/12/6
 * @ClassName WorkspaceService
 * @Description
 * @Version 1.0
 **/
public interface WorkspaceService {

    DocMainListResponseVO getDocMainList();

    void docMainSort(DocMainSortRequest request);
}
