package zhf.config;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

/**
 * @Autor zhenghf
 * @Date 2022/12/1
 * @ClassName ApplicationContextBean
 * @Description
 * @Version 1.0
 **/
//@Configuration
public class ApplicationContextBean {
    @Bean
    @LoadBalanced
    public RestTemplate getRestTemplate() {
        return new RestTemplate();
    }
}
