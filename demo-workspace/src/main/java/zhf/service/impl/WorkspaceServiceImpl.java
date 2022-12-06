package zhf.service.impl;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;
import zhf.entity.DocMainEntity;
import zhf.entity.model.DocMainListResponseVO;
import zhf.entity.model.DocMainSortRequest;
import zhf.repository.DocMainRepository;
import zhf.service.WorkspaceService;

import java.math.BigDecimal;
import java.math.BigInteger;
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

    @Override
    public DocMainListResponseVO getDocMainList() {
        return DocMainListResponseVO.builder().docMainList(docMainRepository.getDocMainList()).build();
    }

    @Override
    public void docMainSort(DocMainSortRequest request) {

        // 根据currentCode获取docEntity
        DocMainEntity docEntity = docMainRepository.getDocMain(request.getCurrentCode());
        // TODO: 2022/12/6 空值判断
        // 获取同级目录和文档
        List<DocMainEntity> docMainList = docMainRepository.getPeerByCurrentCode(docEntity.getParentCode(), request.getCurrentCode());
        // 获取previousCode和nextCode的entity
        AtomicReference<BigDecimal> previousOrder = new AtomicReference<>(new BigDecimal(BigInteger.ZERO));
        AtomicReference<BigDecimal> nextOrder;
//        if (StringUtils.isEmpty(request.getPreviousCode())) {
//            previousOrder = new AtomicReference<>(new BigDecimal(BigInteger.ZERO));
//        }
//        if (StringUtils.isEmpty(request.getPreviousCode())) {
//            nextOrder = new AtomicReference<>(new BigDecimal(BigInteger.ZERO));
//        }
        docMainList.forEach(docMain ->{
            if (docMain.getDocCode().equals(request.getPreviousCode()) && docMain.getDocOrder() != null) {
                previousOrder.set(docMain.getDocOrder());
            }
        });
        // 转成链表


        docMainRepository.updateDocOrderBathch(docMainList);
    }


}
