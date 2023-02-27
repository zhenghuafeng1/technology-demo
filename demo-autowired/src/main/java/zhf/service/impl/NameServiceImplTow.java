package zhf.service.impl;

import org.springframework.stereotype.Service;
import zhf.service.BaseNameService;

/**
 * @Autor zhenghf
 * @Date 2023/2/15
 * @ClassName NameServiceImplOne
 * @Description
 * @Version 1.0
 **/
@Service
public class NameServiceImplTow implements BaseNameService {
    @Override
    public String getName() {
        return "hua";
    }
}
