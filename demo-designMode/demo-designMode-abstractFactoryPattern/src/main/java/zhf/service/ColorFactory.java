package zhf.service;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import zhf.color.Blue;
import zhf.color.Color;
import zhf.color.Green;
import zhf.color.Red;
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
public class ColorFactory extends AbstractFactory {

    @Autowired
    private Red red;

    @Autowired
    private Blue blue;

    @Autowired
    private Green green;

    @Override
    public Shape getShapeFactory(String shape) {
        return null;
    }

    @Override
    public Color getColorFactory(String color) {
        switch (color) {
            case "red" :
                return red;
            case "blue" :
                return blue;
            case "green" :
                return green;
            default:
                return null;
        }
    }
}
