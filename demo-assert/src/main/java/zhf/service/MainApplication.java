package zhf.service;

/**
 * @Autor zhenghf
 * @Date 2022/9/26
 * @ClassName MainApplication
 * @Description
 * @Version 1.0
 **/
public class MainApplication {
    public static void main(String[] args) {

        for(int i=0;i<10;i++){
            System.out.println(i);
            assert false:"error";
        }

    }
}
