package ro.mindit.training.designpatterns.weather.data;

import ro.mindit.training.designpatterns.weather.Observer;
import ro.mindit.training.designpatterns.weather.Subject;

import java.util.ArrayList;

import static java.lang.Thread.sleep;

public class EnhancedWeatherData implements Subject {

    private double temperature;
    private double humidity;
    private double pressure;

    private ArrayList<Observer> observers;


    public EnhancedWeatherData() {
        observers = new ArrayList<>();
    }


    @Override
    public void registerObserver(Observer o) {
        observers.add(o);
    }

    @Override
    public void removeObserver(Observer o) {
        observers.remove(o);
    }

    @Override
    public void notifyObservers() {
        observers.forEach(observer -> observer.update(temperature, humidity, pressure));
    }


    public void measurementsChanged() {
        notifyObservers();
    }

    public void readMeasurementsFromWeatherStation(double temperature, double humidity, double pressure) throws InterruptedException {
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;

        sleep(2000);    // it takes some time to read measurements from the weather station!
        measurementsChanged();
    }
}
