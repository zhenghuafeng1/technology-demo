package zhf.adapterPattern.config;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import java.util.Map;

/**
 * @Autor zhenghf
 * @Date 2022/11/22
 * @ClassName TrackingCustomer
 * @Description
 * @Version 1.0
 **/
@Data
@Component
@ConfigurationProperties(prefix = "handler")
public class TrackingCustomer {
    private Map<String, Object> platform;
}
