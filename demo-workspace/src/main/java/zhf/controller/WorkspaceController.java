package zhf.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import zhf.config.DocumentConfig;
import zhf.config.DocumentFlowConfiguration;
import zhf.entity.DocMainEntity;
import zhf.entity.ResellerBillTaskEntity;
import zhf.entity.ResellerPlatformInfoEntity;
import zhf.entity.model.DocMainListResponseVO;
import zhf.entity.model.DocMainSortRequest;
import zhf.entity.model.ResellerPlatformInfoDto;
import zhf.enums.DocTypeEnum;
import zhf.repository.ResellerBillTaskRepository;
import zhf.repository.ResellerPlatformInfoRepository;
import zhf.service.impl.WorkspaceServiceImpl;

import java.math.BigDecimal;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @Autor zhenghf
 * @Date 2022/12/6
 * @ClassName WorkspaceController
 * @Description
 * @Version 1.0
 **/
@RestController
@RequestMapping("/work")
public class WorkspaceController {

    @Autowired
    private WorkspaceServiceImpl workspaceService;

    @Autowired
    private DocumentConfig documentConfig;

    @Autowired
    private DocumentFlowConfiguration documentFlowConfiguration;

    @Autowired
    private ResellerPlatformInfoRepository resellerPlatformInfoRepository;

    @Autowired
    private ResellerBillTaskRepository resellerBillTaskRepository;

    @GetMapping("/getDocList")
    public DocMainListResponseVO getDocList() {

        return workspaceService.getDocMainList();
    }

    @PutMapping("/sort")
    public DocMainListResponseVO sort(@RequestBody DocMainSortRequest request) {
        workspaceService.docMainSort(request);
        return workspaceService.getDocMainList();
    }

    @GetMapping("/getDocMain")
    public BigDecimal getDocMain() {
        DocMainEntity docMain = new DocMainEntity();
        return docMain.getDocOrder();
    }

    @GetMapping("/getDocPlatform")
    public String getDocPlatform() throws IllegalAccessException {

//        HashMap<String,String> pairs= new HashMap<String,String>();
//        for(Field field : MyConstants.class.getFields())
//        {
//            pairs.put(field.getName().toLowerCase(),field.get(null).toString());
//        }
//        return pairs.toString();

        String platform = documentFlowConfiguration.getSendComponent("feishu");

        return platform;
    }

    @GetMapping("/getDocType/{type}")
    public boolean getDocType(@PathVariable("type") String type) {

        return DocTypeEnum.contains(type);
    }

    @GetMapping("/getAll")
    public List<Long> getAll() {
        List<ResellerBillTaskEntity> resellerBillTasks = resellerBillTaskRepository.queryNextSyncTask(null);
        return resellerBillTasks.stream().map( e -> {
            return e.getId();
        }).collect(Collectors.toList());
    }
}
