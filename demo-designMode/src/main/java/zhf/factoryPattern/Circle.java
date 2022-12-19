package zhf.factoryPattern;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

/**
 * @Autor zhenghf
 * @Date 2022/12/19
 * @ClassName Circle
 * @Description
 * @Version 1.0
 **/
@Slf4j
@Service
public class Circle implements Shape {
    @Override
    public String drawing() {
        return "Drawing Circle ... ...";
    }
}
