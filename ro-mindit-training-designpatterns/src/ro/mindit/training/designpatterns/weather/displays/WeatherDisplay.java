package ro.mindit.training.designpatterns.weather.displays;

import ro.mindit.training.designpatterns.weather.Observer;
import ro.mindit.training.designpatterns.weather.Subject;

/**
 * The subject holds the state.
 */
public abstract class WeatherDisplay implements Observer {

    protected double temperature;
    protected double humidity;
    protected double pressure;

    protected Subject enhancedWeatherData;


    /**
     * Implement this to customize weather display options
     */
    public abstract void display();


    public void unsubscribe() {
        enhancedWeatherData.removeObserver(this);
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
