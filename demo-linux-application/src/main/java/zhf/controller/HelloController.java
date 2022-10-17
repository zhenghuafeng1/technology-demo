package zhf.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import zhf.service.impl.HelloServiceImpl;

/**
 * @Autor zhenghf
 * @Date 2022/9/26
 * @ClassName HelloController
 * @Description
 * @Version 1.0
 **/
@RestController
@RequestMapping("/linux")
public class HelloController {

    @Autowired
    private HelloServiceImpl helloService;

    @GetMapping("/sayHello")
    public String sayHello() {
        return helloService.say();
    }
}
