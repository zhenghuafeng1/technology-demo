package zhf.item;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

/**
 * @Autor zhenghf
 * @Date 2023/1/19
 * @ClassName Coke
 * @Description
 * @Version 1.0
 **/
@Slf4j
@Service
public class Coke extends ColdDrink {
    @Override
    public float price() {
        return 5.0f;
    }

    @Override
    public String name() {
        return "Coke";
    }
}
