package ro.mindit.training.designpatterns.weather.displays;

import ro.mindit.training.designpatterns.weather.Observer;

public class ForecastWeatherDisplay extends WeatherDisplay implements Observer {

    @Override
    public void display() {
        System.out.println("forecast weather display");
    }
}
