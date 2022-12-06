package zhf.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import zhf.entity.model.DocMainListResponseVO;
import zhf.entity.model.DocMainSortRequest;
import zhf.service.impl.WorkspaceServiceImpl;

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

    @GetMapping("/getDocList")
    public DocMainListResponseVO getDocList() {

        return workspaceService.getDocMainList();
    }

    @PutMapping("/sort")
    public DocMainListResponseVO sort(@RequestBody DocMainSortRequest request) {

        return workspaceService.getDocMainList();
    }
}
