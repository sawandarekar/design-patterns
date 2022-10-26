package org.techHub.patterns.behavioral.observer;

public class CurrentConditionsDisplay implements Observer, DisplayElement{

    private double temp;
    private double humidity;
    private final WeatherData weatherData;

    public CurrentConditionsDisplay(WeatherData weatherData) {
        this.weatherData = weatherData;
        this.weatherData.registerObserver(this);
    }
    @Override
    public void display() {
        System.out.println("temp:"+temp+" humidity:"+humidity);
    }

    @Override
    public void update() {
        this.temp = weatherData.getTemperature();
        this.humidity = weatherData.getHumidity();
        display();
    }
}
