package com.example.strfly.learnmode;

import java.util.List;

/**
 * Created by chenjinbo645 on 2017/2/27.
 */

public class ForecastDisplay implements Observer,DisplayElement {
    private WeatherData weatherData;

    private List<Float> forecastTemperatures;//未来几天的温度

    public ForecastDisplay(WeatherData weatherData) {
        this.weatherData = weatherData;
        weatherData.register(this);
    }

    @Override
    public void disPlay() {
        System.out.println("未来几天的气温");
        int count = forecastTemperatures.size();
        for (int i = 0; i < count; i++) {
            System.out.println("第" + i + "天:" + forecastTemperatures.get(i) + "℃");
        }
    }

    @Override
    public void update() {
        this.forecastTemperatures = this.weatherData.getForecastTemperatures();
        disPlay();
    }
}
