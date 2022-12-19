package zhf.factoryPattern;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @Autor zhenghf
 * @Date 2022/12/19
 * @ClassName ShapeFactory
 * @Description
 * @Version 1.0
 **/
@Slf4j
@Service
public class ShapeFactory {

    @Autowired
    private Rectangle rectangle;

    @Autowired
    private Square square;

    @Autowired
    private Circle circle;

    public String getShapeByName(String name) {
        switch (name) {
            case "rectangle" :
                return rectangle.drawing();
            case "square" :
                return square.drawing();
            case "circle" :
                return circle.drawing();
            default:
                return "null drawing ... ...";
        }
    }

}
