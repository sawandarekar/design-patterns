package org.techHub.patterns.behavioral.strategy;

public class MallardDuck extends Duck{

    MallardDuck(){
        this.flyBehavior = new FlyWithWings();
        this.quackBehavior = new Quck();
    }

    @Override
    void swim() {

    }

    @Override
    void display() {
        System.out.println("MallardDuck");
    }
}
