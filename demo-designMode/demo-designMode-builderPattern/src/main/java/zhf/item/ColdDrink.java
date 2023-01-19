package zhf.item;

import org.springframework.beans.factory.annotation.Autowired;
import zhf.pack.Bottle;
import zhf.pack.Packing;

/**
 * @Autor zhenghf
 * @Date 2023/1/19
 * @ClassName ColdDrink
 * @Description
 * @Version 1.0
 **/
public abstract class ColdDrink implements Item {

    @Override
    public Packing packing() {
        return new Bottle();
    }

    public abstract float price();
}
