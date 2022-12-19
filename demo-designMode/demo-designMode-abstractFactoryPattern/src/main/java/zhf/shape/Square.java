package zhf.shape;

import org.springframework.stereotype.Service;

/**
 * @Autor zhenghf
 * @Date 2022/12/19
 * @ClassName Circle
 * @Description
 * @Version 1.0
 **/
@Service
public class Square implements Shape{
    @Override
    public String drawShape() {
        return "Draw Square";
    }
}
