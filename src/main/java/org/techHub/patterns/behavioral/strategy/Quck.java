package org.techHub.patterns.behavioral.strategy;

public class Quck implements QuackBehavior{

    @Override
    public void quack() {
        System.out.println("Quack");
    }
}
