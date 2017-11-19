package ro.mindit.training.designpatterns.weather.displays;

import ro.mindit.training.designpatterns.weather.Observer;

public class CurrentConditionsWeatherDisplay extends WeatherDisplay implements Observer {

    @Override
    public void display() {
        System.out.println("Current conditions: " + temperature + "F degrees and " + humidity + "% humidity");
    }

    @Override
    public void update(double temperature, double humidity, double pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;

        // is this the best place to call display()?
        display();
    }
}
