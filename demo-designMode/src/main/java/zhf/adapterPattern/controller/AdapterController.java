package zhf.adapterPattern.controller;

import com.alibaba.fastjson.JSONObject;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import zhf.adapterPattern.config.TrackingCustomer;
import zhf.adapterPattern.service.IDataHandler;

import java.util.List;
import java.util.Map;

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

    @Autowired
    private TrackingCustomer trackingCustomer;

    @GetMapping("/getHandler")
    public void getHandler() {
        for (int i = 0; i < 5; i++) {
            for (IDataHandler iDataHandler : iDataHandlers) {
                iDataHandler.isMatch("zhf");
            }
        }

    }

    @GetMapping("/test")
    public String test() {
        Map<String, Object> map = trackingCustomer.getPlatform();
        return JSONObject.toJSONString(map);
    }

}
