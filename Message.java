package messageServer;

public interface Message {
    void send(String content,String address);
    public int type();
}
