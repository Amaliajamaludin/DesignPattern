package Command;

abstract class Command_order {

    protected Receiver_BurgerChef BurgerChef;
    protected Receiver_SandwichChef SandwichChef;

    public Command_order() {
    }

    public abstract void Execute_Orderup();
}
