package messageServer;

import java.util.Map;

public class Server {
    public final Map<Integer, Message> messageSenders;

    public Server(Map<Integer, Message> messageSenders) {
        this.messageSenders = messageSenders;
    }

    public void sendMessage(String address, String content, int type) {
        messageSenders.get(type).send(content, address);
    }
}
