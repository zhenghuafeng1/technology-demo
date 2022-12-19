package zhf.service;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import zhf.color.Color;
import zhf.shape.Circle;
import zhf.shape.Rectangle;
import zhf.shape.Shape;
import zhf.shape.Square;

/**
 * @Autor zhenghf
 * @Date 2022/12/19
 * @ClassName ShapeFactory
 * @Description
 * @Version 1.0
 **/
@Slf4j
@Service
public class ShapeFactory extends AbstractFactory {

    @Autowired
    private Rectangle rectangle;

    @Autowired
    private Square square;

    @Autowired
    private Circle circle;

    @Override
    public Shape getShapeFactory(String shape) {
        switch (shape) {
            case "rectangle" :
                return rectangle;
            case "square" :
                return square;
            case "circle" :
                return circle;
            default:
                return null;
        }
    }

    @Override
    public Color getColorFactory(String color) {
        return null;
    }
}
