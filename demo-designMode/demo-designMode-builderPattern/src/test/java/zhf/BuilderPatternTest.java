package zhf;

import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.boot.test.context.SpringBootTest;
import zhf.item.ChickenBurger;
import zhf.item.Coke;
import zhf.item.Pepsi;
import zhf.item.VegBurger;
import zhf.pack.Bottle;
import zhf.pack.Wrapper;
import zhf.service.Meal;
import zhf.service.MealBuilder;

/**
 * @Autor zhenghf
 * @Date 2023/1/19
 * @ClassName BuilderPatternTest
 * @Description
 * @Version 1.0
 **/
@SpringBootTest(classes = {DesignModeApplication.class})
@EnableConfigurationProperties
@Slf4j
public class BuilderPatternTest {

    @Autowired
    private MealBuilder mealBuilder;

    @Test
    public void test() {
        Meal meal = mealBuilder.prepareNonVegMeal();
        meal.showItems();
    }


}
