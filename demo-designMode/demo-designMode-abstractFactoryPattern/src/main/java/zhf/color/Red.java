package zhf.color;

import org.springframework.stereotype.Service;
import zhf.shape.Shape;

/**
 * @Autor zhenghf
 * @Date 2022/12/19
 * @ClassName Circle
 * @Description
 * @Version 1.0
 **/
@Service
public class Red implements Color {
    @Override
    public String fillColor() {
        return "Fill Red";
    }
}
