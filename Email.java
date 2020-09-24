package messageServer;

public class Email implements Message{
    public int type(){
        return 2;
    }

    public void send(String content, String address) {
        System.out.println("Email content = " + content + ", address = " + address);
    }
}
