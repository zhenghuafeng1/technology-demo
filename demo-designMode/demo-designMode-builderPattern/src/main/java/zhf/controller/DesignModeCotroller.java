package zhf.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import zhf.service.Meal;
import zhf.service.MealBuilder;

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
    private MealBuilder mealBuilder;

    @GetMapping("/builderPattern")
    public void getShape() {
        Meal meal = mealBuilder.prepareNonVegMeal();
        meal.showItems();
    }


}
