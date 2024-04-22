package Mediator;

public class Main {
    public static void main(String[] args) {
        ChatroomMediator chatroom = new Chatroom();
        User john = new ChatUser(chatroom, "John");
        User mary = new ChatUser(chatroom, "Mary");
        User bob = new ChatUser(chatroom, "Bob");
        chatroom.addUser(john);
        chatroom.addUser(mary);
        chatroom.addUser(bob);
        john.send("Hi everyone!");
        mary.send("Hey John!");
    }
}
