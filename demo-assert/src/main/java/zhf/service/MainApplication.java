package zhf.service;

/**
 * @Autor zhenghf
 * @Date 2022/9/26
 * @ClassName MainApplication
 * @Description 断言测试
 * @Version 1.0
 **/
public class MainApplication {
    public static void main(String[] args) {

        for (int i = 0; i < 10; i++) {
            assert false : "error";
        }

    }
}
