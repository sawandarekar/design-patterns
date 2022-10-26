package org.techHub.patterns.behavioral.strategy;

import org.junit.jupiter.api.Test;

class DuckSimulatorTest {

    @Test
    void testStrategy(){
        Duck duck = new MallardDuck();
        duck.performFly();
        duck.performQuack();
        duck.setQuackBehavior(new MuteQuack());
        duck.performQuack();
    }
}
