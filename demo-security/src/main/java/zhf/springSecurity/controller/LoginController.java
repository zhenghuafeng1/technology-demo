package zhf.springSecurity.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Autor zhenghf
 * @Date 2022/10/25
 * @ClassName LoginController
 * @Description
 * @Version 1.0
 **/
@RestController
@RequestMapping("security")
public class LoginController {

    @GetMapping("/login")
    public String login() {
        return "hello";
    }

}
