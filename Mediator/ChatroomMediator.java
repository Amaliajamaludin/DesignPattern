package Mediator;

public interface ChatroomMediator {
    void sendMessage(String message, User sender);

    void addUser(User user);
}
