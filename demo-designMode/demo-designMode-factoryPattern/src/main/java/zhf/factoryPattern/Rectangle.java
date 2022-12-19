package zhf.factoryPattern;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

/**
 * @Autor zhenghf
 * @Date 2022/12/19
 * @ClassName Rectangle
 * @Description
 * @Version 1.0
 **/
@Slf4j
@Service
public class Rectangle implements Shape {
    @Override
    public String drawing() {
        return "Drawing Rectangle ... ...";
    }
}
