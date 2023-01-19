package zhf.pack;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

/**
 * @Autor zhenghf
 * @Date 2023/1/19
 * @ClassName Wrapper
 * @Description
 * @Version 1.0
 **/
@Slf4j
@Service
public class Wrapper implements Packing{
    @Override
    public String pack() {
        return "Wrapper";
    }
}
