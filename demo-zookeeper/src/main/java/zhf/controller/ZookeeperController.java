package zhf.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import zhf.api.ZookeeperApi;

import java.util.UUID;

/**
 * @Autor zhenghf
 * @Date 2022/12/1
 * @ClassName zookeeperController
 * @Description
 * @Version 1.0
 **/
@Slf4j
@RestController
@RequestMapping("/zookeeper")
public class ZookeeperController implements ZookeeperApi {

    @Value("${server.port:8100}")
    private String serverPort;

    @GetMapping("/provider")
    public String getProvider() {
        log.info("this is provider");
        return "springcloud with zookeeper: " + serverPort + "\t" + UUID.randomUUID().toString();
    }
}
