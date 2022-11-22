package zhf.service;

import java.util.HashMap;
import java.util.Map;

/**
 * @Autor zhenghf
 * @Date 2022/9/26
 * @ClassName MainApplication
 * @Description 断言测试
 * @Version 1.0
 **/
public class MainApplication {
    public static void main(String[] args) {

        Map<String, String> map = new HashMap<>();
        map.put("ruleParam", "Long,x,1073741824");

        String ruleParam = map.get("ruleParam");
        String[] split = ruleParam.split(",", -1);
        for (String str : split) {
            System.out.println(str);
        }
        System.out.println(split.length);

    }
}
