package Strategy;

public class MallardDuck extends Duck {
    public MallardDuck() {
        // A MallardDuck use the Quack class to handle its quack, so when
        // PerformQuack is called, the responsibility for the quack is delegated
        // to the Quack object.
        quackBehavior = new Quack();
        flyBehavior = new FlyWithWings();
        // MallardDuck inherits the quackBehavior and flyBehavior instance variables
        // from Duck class
    }

    public void display() {
        System.out.println("I'm a real Mallard duck");
    }

}