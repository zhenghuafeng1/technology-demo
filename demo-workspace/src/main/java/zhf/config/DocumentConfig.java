package zhf.config;

import lombok.Data;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

/**
 * @Autor zhenghf
 * @Date 2022/12/9
 * @ClassName DocumentConfig
 * @Description
 * @Version 1.0
 **/
@Configuration
@Data
public class DocumentConfig {

    @Value("${document.platform:feishu}")
    private String platform;
}
