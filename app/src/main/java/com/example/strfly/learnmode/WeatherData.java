package com.example.strfly.learnmode;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by chenjinbo645 on 2017/2/27.
 */

public class WeatherData implements Subject {

    List<Observer> observers;
    private float temperature;
    private float humidity;
    private float pressure;
    private List<Float> forecastTemperatures;

    public WeatherData() {
        observers = new ArrayList<>();
    }

    @Override
    public void register(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void remove(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notification() {
        for (Observer observer : observers) {
            observer.update();
        }
    }


    public void setMeasurements(float temperature,float humidity,float pressure, List<Float> forecastTemperatures) {
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        this.forecastTemperatures = forecastTemperatures;
        notification();
    }


    public float getTemperature() {
        return temperature;
    }

    public float getHumidity() {
        return humidity;
    }

    public float getPressure() {
        return pressure;
    }

    public List<Float> getForecastTemperatures() {
        return forecastTemperatures;
    }
}
