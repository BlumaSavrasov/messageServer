package messageServer;

public class Whatsapp implements Message{
    public int type(){
        return 0;
    }

    public void send(String content, String address) {
        System.out.println("Whatsapp content = " + content + ", address = " + address);
    }
}
