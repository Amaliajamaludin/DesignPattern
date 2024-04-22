package Command;

class ConcreteCommand_order extends Command_order {

    public ConcreteCommand_order(Receiver_BurgerChef BurgerChef, Receiver_SandwichChef SandwichChef) {
        this.BurgerChef = BurgerChef;
        this.SandwichChef = SandwichChef;
    }

    @Override
    public void Execute_Orderup() {
        BurgerChef.MakeBurger();
        SandwichChef.MakeSandwich();
    }
}
