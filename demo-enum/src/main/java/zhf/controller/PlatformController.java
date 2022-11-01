package zhf.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import zhf.service.PlatformService;

import java.beans.Expression;

/**
 * @Autor zhenghf
 * @Date 2022/11/1
 * @ClassName PlatformController
 * @Description
 * @Version 1.0
 **/
@RestController
@RequestMapping("/enum")
public class PlatformController {

    @Autowired
    private PlatformService platformService;

    @GetMapping("/test/{name}")
    public Object test(@PathVariable("name") String name) throws Exception {
        String[] names = {"taobao", "tianmao"};
        Expression expression = new Expression(platformService, "getPlatform", names);
        return expression.getValue();
    }
}
