package zhf.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import zhf.color.Color;
import zhf.service.AbstractFactory;
import zhf.service.FactoryProduct;
import zhf.service.ShapeFactory;
import zhf.shape.Shape;

import java.util.HashMap;
import java.util.Map;

/**
 * @Autor zhenghf
 * @Date 2022/12/19
 * @ClassName DesignModeCotroller
 * @Description 
 * @Version 1.0
**/
@RestController
@RequestMapping("/designMode")
public class DesignModeCotroller {

    @Autowired
    private FactoryProduct factoryProduct;

    @GetMapping("/abstractFactoryPattern/{shape}/{color}")
    public Map<String, String> getShape(@PathVariable("shape") String shape, @PathVariable("color") String color) {
        AbstractFactory shapeFactory = factoryProduct.getFactory("shape");
        Shape shape1 = shapeFactory.getShapeFactory(shape);

        AbstractFactory colorFactory = factoryProduct.getFactory("color");
        Color color1 = colorFactory.getColorFactory(color);

        Map<String, String> map = new HashMap<>();
        map.put(shape, shape1.drawShape());
        map.put(color, color1.fillColor());

        return map;
    }


}
