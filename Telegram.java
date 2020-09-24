package messageServer;

public class Telegram implements Message{
    public int type(){
        return 1;
    }

    public void send(String content, String address) {
        System.out.println("Telegram content = " + content + ", address = " + address);
    }
}
