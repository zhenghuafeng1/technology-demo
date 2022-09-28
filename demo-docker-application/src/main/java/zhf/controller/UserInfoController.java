package zhf.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import zhf.entity.UserInfoEntity;
import zhf.service.impl.UserInfoServiceImpl;

/**
 * @Autor zhenghf
 * @Date 2022/9/28
 * @ClassName UserInfoController
 * @Description
 * @Version 1.0
 **/
@Slf4j
@RestController
@RequestMapping("/docker")
public class UserInfoController {

    @Autowired
    private UserInfoServiceImpl userInfoService;

    @GetMapping("/getUserInfo/{id}")
    public UserInfoEntity getUserById(@PathVariable("id") String id) {
        log.info("request get user");
        return userInfoService.get(id);
    }
}
