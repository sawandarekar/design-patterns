package org.techHub.patterns.behavioral.strategy;

public class FlyNoWay implements FlyBehavior{

    @Override
    public void fly() {
        System.out.println("Not flying");
    }
}
