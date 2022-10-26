package org.techHub.patterns.behavioral.strategy;

public abstract class Duck {

    FlyBehavior flyBehavior;
    QuackBehavior quackBehavior;

    abstract void swim();

    abstract void display();

    void performQuack() {
        quackBehavior.quack();
    }

    void performFly() {
        flyBehavior.fly();
    }

    void setFlyBehavior(FlyBehavior f) {
        this.flyBehavior = f;
    }

    void setQuackBehavior(QuackBehavior q) {
        this.quackBehavior = q;
    }
}
