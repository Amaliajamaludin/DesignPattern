package Mediator;

abstract class User {
    protected ChatroomMediator mediator;
    protected String name;

    public User(ChatroomMediator mediator, String name) {
        this.mediator = mediator;
        this.name = name;
    }

    public abstract void send(String message);

    public abstract void receiveMessage(String message);
}
