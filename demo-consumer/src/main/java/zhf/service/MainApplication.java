package zhf.service;

import java.util.function.Consumer;

/**
 * @Autor zhenghf
 * @Date 2022/9/26
 * @ClassName MainApplication
 * @Description
 * @Version 1.0
 **/
public class MainApplication {
    public static void main(String[] args) {
        a(1,2);
    }

    public static void a(int x, int y) {
        Consumer<Integer> consumer = null;
        consumer = z -> z = x + 2;
        b(consumer);
    }

    public static void b(Consumer<Integer> consumer) {
        consumer.accept(3);
    }
}
