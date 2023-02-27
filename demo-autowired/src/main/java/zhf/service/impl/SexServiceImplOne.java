package zhf.service.impl;

import org.springframework.stereotype.Service;
import zhf.service.BaseSexService;

/**
 * @Autor zhenghf
 * @Date 2023/2/15
 * @ClassName SexServiceImplOne
 * @Description
 * @Version 1.0
 **/
@Service
public class SexServiceImplOne implements BaseSexService {
    @Override
    public String getSex() {
        return "boy";
    }
}
