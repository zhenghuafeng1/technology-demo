package zhf.buffer;

import lombok.extern.slf4j.Slf4j;

import java.nio.IntBuffer;

/**
 * @Autor zhenghf
 * @Date 2022/10/25
 * @ClassName BufferUtil
 * @Description
 * @Version 1.0
 **/
@Slf4j
public class BufferUtil {

    public static void main(String[] args) {
        IntBuffer intBuffer = IntBuffer.allocate(10);
        intBuffer.put(10);
        intBuffer.put(101);
        log.info("Write mode: ");
        log.info("\tCapacity: {}", intBuffer.capacity());
        log.info("\tPosition: {}", intBuffer.position());
        log.info("\tLimit:  {}", intBuffer.limit());

        intBuffer.flip();
        log.info("Read mode: ");
        log.info("\tCapacity: {}", intBuffer.capacity());
        log.info("\tPosition: {}", intBuffer.position());
        log.info("\tLimit: {}", intBuffer.limit());

    }
}
