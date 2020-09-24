package messageServer;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class MassageServer {
    public static void main(String[] args) {
        Message tg = new Telegram();
        Message wh = new Whatsapp();
        Message em = new Email();

       Map<Integer, Message> messages = Map.of(tg.type(), tg , wh.type(), wh , em.type(), em);
        Server srv = new Server(messages);
        srv.sendMessage("ad1", "text", 0);
        srv.sendMessage("ad2", "text", 1);
        srv.sendMessage("ad3", "text", 2);
    }
}
