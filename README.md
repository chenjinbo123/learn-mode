###观察者模式



1. 首先存在两个对象，观察者和被观察者，被观察者需要在创建的时候初始化一个放置观察者的集合，并且要提供注册，删除，以及通知等方法。
2. 观察者需要存在一个更新update()的方法。
3. 当运行观察者模式的时候，被观察者一旦改变数据源，并且发出通知，就会遍历已经注册的观察者的集合，并且调用他们的update()方法，实现及时更新。
4. 这一切都需要通过接口实现解耦合。



```java
  		WeatherData weatherData = new WeatherData();
        CurrentConditionsDisplay currentConditionsDisplay = new CurrentConditionsDisplay(weatherData);
        ForecastDisplay forecastDisplay = new ForecastDisplay(weatherData);
        List<Float> forecastTemperatures = new ArrayList<Float>();
        forecastTemperatures.add(22f);
        forecastTemperatures.add(-1f);
        forecastTemperatures.add(9f);
        forecastTemperatures.add(23f);
        forecastTemperatures.add(27f);
        forecastTemperatures.add(30f);
        forecastTemperatures.add(10f);
        //发出通知
        weatherData.setMeasurements(22f, 0.8f, 1.2f, forecastTemperatures);
```



