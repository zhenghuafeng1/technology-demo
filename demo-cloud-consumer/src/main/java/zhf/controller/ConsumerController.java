package zhf.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import zhf.api.ZookeeperApi;

/**
 * @Autor zhenghf
 * @Date 2022/12/1
 * @ClassName ConsumerController
 * @Description
 * @Version 1.0
 **/
@Slf4j
@RestController
@RequestMapping("/consumer")
public class ConsumerController {

//    public static final String INVOKE_URL = "http://cloud-zk-provider1";

//    @Resource
//    private RestTemplate restTemplate;

    @Autowired
    private ZookeeperApi zookeeperApi;

    @GetMapping("/test")
    public String test() {
//        String result = restTemplate.getForObject(INVOKE_URL + "/zookeeper/provider", String.class);
        String result = zookeeperApi.getProvider();
        log.info("消费者调用支付服务(zookeeper)--->result:" + result);
        return result;
    }
}
