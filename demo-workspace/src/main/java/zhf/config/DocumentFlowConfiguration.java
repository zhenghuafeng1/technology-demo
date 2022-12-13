package zhf.config;

import lombok.Data;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.util.StringUtils;

import javax.annotation.PostConstruct;
import java.lang.reflect.Field;
import java.util.HashMap;

/**
 * @Autor zhenghf
 * @Date 2022/12/9
 * @ClassName DocumentFlowConfiguration
 * @Description
 * @Version 1.0
 **/
@Slf4j
@Configuration
@Data
public class DocumentFlowConfiguration {

    private static final String SEND_COMPONENT = "_SEND_COMPONENT";

    @Value("${document.platform:feishu}")
    private String platform;

    private HashMap<String, String> flowConstantMap = new HashMap<>();

    /**
     * @author zhenghf
     * @date 2022/12/9
     * @description
     */
    @PostConstruct
    public void initialize() {
        for (Field field : MyConstants.class.getFields()) {
            try {
                flowConstantMap.put(field.getName(), field.get(null).toString());
            }
            catch (IllegalAccessException e) {
                log.error(e.getMessage(), e);
            }
        }
    }

    public String getSendComponent(String platform) {
        if (platform == null) {
            return null;
        }
        String sendComponent = flowConstantMap.get(platform.toUpperCase() + SEND_COMPONENT);
        return sendComponent;
    }

}
