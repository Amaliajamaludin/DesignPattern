package Command;

class invoker_waitress {
    private Command_order command_order;

    public void SetCommand_TakeOrder(Command_order command_order) {
        this.command_order = command_order;
    }

    public void Orderup(){
        command_order.Execute_Orderup();
    }
}
