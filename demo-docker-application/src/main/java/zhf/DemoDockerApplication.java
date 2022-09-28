package zhf;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.autoconfigure.orm.jpa.HibernateJpaAutoConfiguration;

/**
 * @Autor zhenghf
 * @Date 2022/9/28
 * @ClassName DemoDockerApplication
 * @Description
 * @Version 1.0
 **/
@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class,  HibernateJpaAutoConfiguration.class})
public class DemoDockerApplication {
    public static void main(String[] args) {
        SpringApplication.run(DemoDockerApplication.class, args);
    }
}
