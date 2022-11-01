package zhf.service;

import org.springframework.stereotype.Service;

/**
 * @Autor zhenghf
 * @Date 2022/11/1
 * @ClassName PlatformService
 * @Description
 * @Version 1.0
 **/
@Service
public class PlatformService {

    public String getPlatform(String name, String name2) {
        System.out.println(name);
        System.out.println(name2);
        return name;
    }

}
