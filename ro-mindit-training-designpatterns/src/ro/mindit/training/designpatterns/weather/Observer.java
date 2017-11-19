package ro.mindit.training.designpatterns.weather;

public interface Observer {

    // Is this a good approach?
    // What happens if the WeatherStation adds a new measurement?
    void update(double temperature, double humidity, double pressure);
}
