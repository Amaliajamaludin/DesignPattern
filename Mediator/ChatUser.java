package Mediator;

class ChatUser extends User {
    public ChatUser(ChatroomMediator mediator, String name) {
        super(mediator, name);
    }

    public void send(String message) {
        mediator.sendMessage(message, this);
    }

    public void receiveMessage(String message) {
        System.out.println(name + " received message: " + message);
    }
}
