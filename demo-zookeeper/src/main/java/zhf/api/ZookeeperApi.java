package zhf.api;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @Autor zhenghf
 * @Date 2022/12/1
 * @ClassName ZookeeperApi
 * @Description
 * @Version 1.0
 **/
@FeignClient(name = "cloud-zk-provider1", path = "/zookeeper")
public interface ZookeeperApi {
    @GetMapping("/provider")
    String getProvider();
}
