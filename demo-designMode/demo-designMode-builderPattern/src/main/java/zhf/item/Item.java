package zhf.item;

import zhf.pack.Packing;

/**
 * @Autor zhenghf
 * @Date 2023/1/19
 * @ClassName Item
 * @Description
 * @Version 1.0
 **/
public interface Item {
    float price();
    Packing packing();
    String name();
}
