package zhf.service;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import zhf.item.ChickenBurger;
import zhf.item.Coke;
import zhf.item.Pepsi;
import zhf.item.VegBurger;

/**
 * @Autor zhenghf
 * @Date 2023/1/19
 * @ClassName MealBuilder
 * @Description
 * @Version 1.0
 **/
@Slf4j
@Service
public class MealBuilder {

    public Meal prepareVegMeal() {
        Meal meal = new Meal();
        meal.addItem(new VegBurger());
        meal.addItem(new Coke());
        return meal;
    }

    public Meal prepareNonVegMeal() {
        Meal meal = new Meal();
        meal.addItem(new ChickenBurger());
        meal.addItem(new Pepsi());
        return meal;
    }
}
