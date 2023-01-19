package zhf.item;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

/**
 * @Autor zhenghf
 * @Date 2023/1/19
 * @ClassName Pepsi
 * @Description
 * @Version 1.0
 **/
@Slf4j
@Service
public class Pepsi extends ColdDrink {
    @Override
    public float price() {
        return 8.0f;
    }

    @Override
    public String name() {
        return "Pepsi";
    }
}
