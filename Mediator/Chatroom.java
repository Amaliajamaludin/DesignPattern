package Mediator;

import java.util.ArrayList;
import java.util.List;

// Concrete Mediator
class Chatroom implements ChatroomMediator {
    private List<User> users;

    public Chatroom() {
        this.users = new ArrayList<>();
    }

    public void sendMessage(String message, User sender) {
        for (User user : users) {
            if (user != sender) {
                user.receiveMessage(message);
            }
        }
    }

    public void addUser(User user) {
        users.add(user);
    }
}
