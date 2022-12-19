package zhf.color;

import org.springframework.stereotype.Service;

/**
 * @Autor zhenghf
 * @Date 2022/12/19
 * @ClassName Circle
 * @Description
 * @Version 1.0
 **/
@Service
public class Green implements Color {
    @Override
    public String fillColor() {
        return "Fill Green";
    }
}
