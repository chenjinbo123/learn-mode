package com.example.strfly.learnmode;

/**
 * Created by chenjinbo645 on 2017/2/27.
 */

public class CurrentConditionsDisplay implements Observer,DisplayElement {
    private WeatherData weatherData;
    private float temperature;//温度
    private float humidity;//湿度
    private float pressure;//气压
    public CurrentConditionsDisplay(WeatherData weatherData) {
        this.weatherData = weatherData;
        weatherData.register(this);
    }

    @Override
    public void disPlay() {
        System.out.println("当前温度为：" + this.temperature + "℃");
        System.out.println("当前湿度为：" + this.humidity);
        System.out.println("当前气压为：" + this.pressure);
    }

    @Override
    public void update() {
        this.temperature = weatherData.getTemperature();
        this.humidity = weatherData.getHumidity();
        this.pressure = weatherData.getPressure();
        disPlay();
    }
}
