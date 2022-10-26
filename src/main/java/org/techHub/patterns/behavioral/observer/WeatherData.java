package org.techHub.patterns.behavioral.observer;

import java.util.ArrayList;
import java.util.List;

public class WeatherData implements Subject{

    private List<Observer> observerList;
    private double temp;
    private double humidity;
    private double pressure;

    public WeatherData(){
        observerList = new ArrayList<>();
    }

    @Override
    public void registerObserver(Observer o) {
        this.observerList.add(o);
    }

    @Override
    public void removeObserver(Observer o) {
        this.observerList.remove(o);
    }

    @Override
    public void notifyObservers() {
        this.observerList.forEach(Observer::update);
    }

    public void setMeasurements(double t, double h, double p){
        this.temp = t;
        this.humidity = h;
        this.pressure = p;
        measurementsChanged();
    }

    private void measurementsChanged(){
        notifyObservers();
    }

    public double getTemperature(){
        return this.temp;
    }
    public double getHumidity(){
        return this.humidity;
    }
    public double getPressure(){
        return this.pressure;
    }

}
