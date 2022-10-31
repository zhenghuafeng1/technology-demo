package zhf.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import zhf.enums.PlatformEnum;
import zhf.service.impl.HelloServiceImpl;

/**
 * @Autor zhenghf
 * @Date 2022/9/26
 * @ClassName HelloController
 * @Description
 * @Version 1.0
 **/
@Slf4j
@RestController
@RequestMapping("/linux")
public class HelloController {

    @Autowired
    private HelloServiceImpl helloService;

    @GetMapping("/sayHello")
    public String sayHello() {
        log.info("收到请求");
        return helloService.say();
    }

    @GetMapping("/sayHello/{id}")
    public String sayHello1(@PathVariable("id") String id) {
        return PlatformEnum.getPlatform(id).getValue();
    }

}
