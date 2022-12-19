package zhf.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import zhf.color.Color;

/**
 * @Autor zhenghf
 * @Date 2022/12/19
 * @ClassName FactoryProduct
 * @Description
 * @Version 1.0
 **/
@Service
public class FactoryProduct {

    @Autowired
    private ShapeFactory shapeFactory;

    @Autowired
    private ColorFactory colorFactory;

    public AbstractFactory getFactory(String choise) {
        switch (choise) {
            case "shape" :
                return shapeFactory;
            case "color" :
                return colorFactory;
            default:
                return null;
        }
    }
}
