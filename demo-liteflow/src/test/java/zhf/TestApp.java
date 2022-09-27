package zhf;

import com.yomahub.liteflow.core.FlowExecutor;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.autoconfigure.orm.jpa.HibernateJpaAutoConfiguration;
import zhf.entity.PersonEntity;
import zhf.enums.SexEnum;

import javax.annotation.Resource;

/**
 * @Autor zhenghf
 * @Date 2022/9/23
 * @ClassName TestApp
 * @Description
 * @Version 1.0
 **/
@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class , HibernateJpaAutoConfiguration.class})
public class TestApp {

}
