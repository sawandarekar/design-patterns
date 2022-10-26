package org.techHub.patterns.behavioral.observer;

import org.junit.jupiter.api.Test;

class ObserverPatternTest {

    @Test
    void testObserver(){
        WeatherData w = new WeatherData();
        Observer o = new CurrentConditionsDisplay(w);
        w.setMeasurements(12.2, 3.4, 32.5);
    }
}
