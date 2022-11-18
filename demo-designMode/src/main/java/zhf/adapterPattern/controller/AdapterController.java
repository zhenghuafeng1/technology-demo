package zhf.adapterPattern.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import zhf.adapterPattern.service.IDataHandler;

import java.util.List;

/**
 * @Autor zhenghf
 * @Date 2022/11/16
 * @ClassName AdapterController
 * @Description
 * @Version 1.0
 **/
@Slf4j
@RestController
@RequestMapping("/adapter")
public class AdapterController {

    @Autowired
    private List<IDataHandler> iDataHandlers;

    @GetMapping("/getHandler")
    public void getHandler() {
        for (IDataHandler iDataHandler : iDataHandlers) {
            iDataHandler.handle("zhf");
        }
    }

}
