package zhf.service.impl;

import com.alibaba.fastjson.JSONObject;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.collections.list.PredicatedList;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;
import zhf.entity.DocMainEntity;
import zhf.entity.model.DocMainListResponseVO;
import zhf.entity.model.DocMainSortRequest;
import zhf.repository.DocMainRepository;
import zhf.service.WorkspaceService;
import zhf.utils.SortNode;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;

/**
 * @Autor zhenghf
 * @Date 2022/12/6
 * @ClassName WorkspaceServiceImpl
 * @Description
 * @Version 1.0
 **/
@Slf4j
@Service
public class WorkspaceServiceImpl implements WorkspaceService {

    @Autowired
    private DocMainRepository docMainRepository;

    @Autowired
    private SortNode sortNode;

    @Override
    public DocMainListResponseVO getDocMainList() {
        return DocMainListResponseVO.builder().docMainList(docMainRepository.getDocMainList()).build();
    }

    @Override
    public void docMainSort(DocMainSortRequest request) {

        // 根据currentCode获取docEntity
        DocMainEntity docEntity = docMainRepository.getDocMain(request.getCurrentCode());
        // 获取同级目录和文档
        List<DocMainEntity> docMainList = docMainRepository.getPeerByCurrentCode(docEntity.getParentCode(), request.getCurrentCode());

        SortNode node = sortNode.build(docMainList);
        log.info(node.toString());
        //第一个文档
        /*if (StringUtils.isEmpty(request.getPreviousCode())) {
            docEntity.setDocOrder(BigDecimal.ZERO);
            sortNode.addHeader(node, docEntity);
            sortDocMain(node);
            return;
        }*/

        //最后一个文档
        sortNode.addTail(node, docEntity);
        log.info(node.toString());
    }

    /**
     * @author zhenghf
     * @date 2022/12/7
     * @description 排序
     * @param sortNode
     */
    private void sortDocMain(SortNode sortNode) {
        List<DocMainEntity> docMains = new ArrayList<>();
        while (sortNode != null) {
            DocMainEntity docMain = DocMainEntity.builder()
                    .id(sortNode.getDocEntity().getId())
                    .docOrder(sortNode.getOrderCode())
                    .build();
            docMains.add(docMain);
            sortNode = sortNode.getNext();
        }
        log.info(docMains.toString());
//        docMainRepository.updateDocOrderBatch(docMains);
    }


}
