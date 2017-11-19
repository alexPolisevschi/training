package ro.mindit.training.designpatterns.weather.data;

public interface WeatherData {

    double getTemperature();
    double getHumidity();
    double getPressure();

    boolean messurementsChanged();
}
