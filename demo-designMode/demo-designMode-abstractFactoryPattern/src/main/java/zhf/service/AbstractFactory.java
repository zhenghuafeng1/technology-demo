package zhf.service;

import zhf.color.Color;
import zhf.shape.Shape;

/**
 * @Autor zhenghf
 * @Date 2022/12/19
 * @ClassName AbstractFactory
 * @Description
 * @Version 1.0
 **/
public abstract class AbstractFactory {
    public abstract Shape getShapeFactory(String shape);
    public abstract Color getColorFactory(String color);
}
