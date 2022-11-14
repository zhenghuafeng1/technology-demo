package zhf.base;

import lombok.Data;
import zhf.enums.MethodEnum;

import java.util.Map;

/**
 * @Autor zhenghf
 * @Date 2022/11/14
 * @ClassName MethodUrl
 * @Description
 * @Version 1.0
 **/
@Data
public class MethodUrl {

    /**
     * 完整路径
     */
    private String url;

    /**
     * 请求方法
     */
    private MethodEnum method;

    /**
     * 请求参数
     */
    private Map<String, Object> paramMap;
}
