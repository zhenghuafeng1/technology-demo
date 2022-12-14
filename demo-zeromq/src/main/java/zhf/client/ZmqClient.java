package zhf.client;

import lombok.extern.slf4j.Slf4j;
import org.zeromq.SocketType;
import org.zeromq.ZContext;
import org.zeromq.ZMQ;

/**
 * @Autor zhenghf
 * @Date 2022/11/18
 * @ClassName ZmqClient
 * @Description
 * @Version 1.0
 **/
@Slf4j
public class ZmqClient {
    public static void main(String[] args) {
        try (ZContext context = new ZContext()) {
            System.out.println("Connecting to hello world server");

            //  Socket to talk to server
            ZMQ.Socket socket = context.createSocket(SocketType.REQ);
            socket.connect("tcp://localhost:5555");

            for (int requestNbr = 0; requestNbr != 10; requestNbr++) {
                String request = "Hello";
                System.out.println("Sending Hello " + requestNbr);
                socket.send(request.getBytes(ZMQ.CHARSET), 0);

                byte[] reply = socket.recv(0);
                log.info("Received " + new String(reply, ZMQ.CHARSET) + " " + requestNbr);
            }
        }
    }
}

