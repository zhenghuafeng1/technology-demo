package zhf.controller;


import com.alibaba.fastjson.JSONObject;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

/**
 * @Autor zhenghf
 * @Date 2022/11/16
 * @ClassName AdapterController
 * @Description
 * @Version 1.0
 **/
@RestController
@RequestMapping("/adapter")
public class AdapterController {

    @PostMapping("/getPoolContext")
    public String adapterTest(@RequestBody Map<String, Object> params) {
        String jsonString = JSONObject.toJSONString(params);
        return jsonString;
    }
}
