# messageServer
We have server class, in this class we have function sendMessage that get three parameters content, address and distributionType.
The goal is to write the function sendMessage to send a message acording to the distribution type as clean as posible.
My solution:
step one, I created a intarface Message with only one function send. Now any type of message will implement this interface.
step two, i added a map of Messages in the server class using the distributionType as a key. That way we can get the Message object by using the get function and than when invoking the function send it will invoke its specified function.
--> Now in the future when want to add a new type of message all we need is to derive it from the Message interface and to add the new type to our map of messages so the server will have the information about it. That it, no unnececrily changes in the sendMessage function so it's stays nice and clean:).
