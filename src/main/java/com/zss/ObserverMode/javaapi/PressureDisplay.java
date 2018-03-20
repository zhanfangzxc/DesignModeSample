package com.zss.ObserverMode.javaapi;

import com.zss.ObserverMode.sample.DisplayElement;

import java.util.Observable;
import java.util.Observer;

public class PressureDisplay implements Observer, DisplayElement {
    Observable observable;
    private float temperature;
    private float humidity;

    public PressureDisplay(Observable observable) {
        this.observable = observable;
        observable.addObserver(this); //将该对象注册为观察者
    }

    @Override
    public void update(Observable o, Object arg) {
        if (o instanceof WeatherData) {
            WeatherData weatherData = (WeatherData) o;
            this.temperature = weatherData.getTemperature();
            this.humidity = weatherData.getHumidity();
            display();
        }
    }

    @Override
    public void display() {
        System.out.println("Current conditions: " + temperature + "F degrees and " + humidity + "% humidity");
    }
}
