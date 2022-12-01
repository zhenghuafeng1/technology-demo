package zhf;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @Autor zhenghf
 * @Date 2022/12/1
 * @ClassName ZookeeperApplication
 * @Description
 * @Version 1.0
 **/
@EnableFeignClients
@EnableDiscoveryClient
@SpringBootApplication
public class ZookeeperApplication {
    public static void main(String[] args) {
        SpringApplication.run(ZookeeperApplication.class, args);
    }
}
