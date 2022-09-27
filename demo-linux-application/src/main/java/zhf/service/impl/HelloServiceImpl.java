package zhf.service.impl;

import org.springframework.stereotype.Service;
import zhf.service.HelloService;

/**
 * @Autor zhenghf
 * @Date 2022/9/26
 * @ClassName HelloServiceImpl
 * @Description
 * @Version 1.0
 **/
@Service
public class HelloServiceImpl implements HelloService {
    @Override
    public String say() {
        return "hello";
    }
}
