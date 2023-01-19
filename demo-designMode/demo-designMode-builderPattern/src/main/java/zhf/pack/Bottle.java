package zhf.pack;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

/**
 * @Autor zhenghf
 * @Date 2023/1/19
 * @ClassName Bottle
 * @Description
 * @Version 1.0
 **/
@Slf4j
@Service
public class Bottle implements Packing{
    @Override
    public String pack() {
        return "Bottle";
    }
}
