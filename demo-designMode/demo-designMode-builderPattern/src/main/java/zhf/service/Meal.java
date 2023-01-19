package zhf.service;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import zhf.item.Item;

import java.util.ArrayList;
import java.util.List;

/**
 * @Autor zhenghf
 * @Date 2023/1/19
 * @ClassName Meal
 * @Description
 * @Version 1.0
 **/
@Slf4j
@Service
public class Meal {

    private List<Item> items = new ArrayList<>();

    public void addItem(Item item) {
        items.add(item);

    }

    public float getCost() {
        float cost = 0.0f;
        for (Item item : items) {
            cost = item.price() + cost;
        }
        return cost;
    }

    public void showItems() {
        for (Item item : items) {
            log.info("Item={}", item.name());
            log.info("price={}", item.price());
            log.info("packing={}", item.packing().pack());
        }
    }

}
