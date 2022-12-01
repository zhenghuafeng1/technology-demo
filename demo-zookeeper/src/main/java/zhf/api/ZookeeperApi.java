package zhf.api;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @Autor zhenghf
 * @Date 2022/12/1
 * @ClassName ZookeeperApi
 * @Description
 * @Version 1.0
 **/
@FeignClient(value = "zookeeper")
public interface ZookeeperApi {
    @GetMapping("/provider")
    String getProvider();
}
