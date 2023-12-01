package DuckCall;

import MiniDuckSimulator.Quack;
import MiniDuckSimulator.QuackBehaviour;

public class DuckCall {
    QuackBehaviour quackBehaviour;

    public DuckCall() {
        quackBehaviour = new Quack();
    }

    public void display() {
        System.out.println("I'm a duck call");
    }

    public void performCall() {
        quackBehaviour.quack();
    }

    public static void main(String[] args) {
        DuckCall duckCall = new DuckCall();
        duckCall.display();
        duckCall.performCall();
    }
}
