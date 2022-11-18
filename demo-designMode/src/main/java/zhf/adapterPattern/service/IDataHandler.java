package zhf.adapterPattern.service;

/**
 * @Autor zhenghf
 * @Date 2022/11/16
 * @ClassName IDataHandler
 * @Description
 * @Version 1.0
 **/
public interface IDataHandler {
    void handle(String nickName);

    boolean isMatch();
}
