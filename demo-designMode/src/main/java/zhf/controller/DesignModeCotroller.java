package zhf.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import zhf.factoryPattern.ShapeFactory;

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
    private ShapeFactory shapeFactory;

    @GetMapping("/factoryPattern/{type}")
    public String getShape(@PathVariable("type") String type) {
        return shapeFactory.getShapeByName(type);
    }


}
