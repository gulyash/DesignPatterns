package quack;

import quack.QuackBehavior;

public class Squeak implements QuackBehavior {
    @Override
    public void quack() {
        System.out.println("quack.Squeak");
    }
}
