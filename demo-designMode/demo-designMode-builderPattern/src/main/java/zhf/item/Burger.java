package zhf.item;

import org.springframework.beans.factory.annotation.Autowired;
import zhf.pack.Packing;
import zhf.pack.Wrapper;

/**
 * @Autor zhenghf
 * @Date 2023/1/19
 * @ClassName Burger
 * @Description
 * @Version 1.0
 **/
public abstract class Burger implements Item {


    @Override
    public Packing packing() {
        return new Wrapper();
    }

    public abstract float price();
}
