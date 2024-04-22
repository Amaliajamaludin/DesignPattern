package Command;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        Receiver_BurgerChef burgerChef = new Receiver_BurgerChef();
        Receiver_SandwichChef sandwichChef = new Receiver_SandwichChef();
        Command_order command_order = new ConcreteCommand_order(burgerChef, sandwichChef);
        invoker_waitress invoker_waitress = new invoker_waitress();

        invoker_waitress.SetCommand_TakeOrder(command_order);
        invoker_waitress.Orderup();

        System.in.read(); // Wait for user input
    }
}
