package ro.mindit.training.designpatterns.weather;

import ro.mindit.training.designpatterns.weather.data.EnhancedWeatherData;
import ro.mindit.training.designpatterns.weather.displays.CurrentConditionsWeatherDisplay;
import ro.mindit.training.designpatterns.weather.displays.ForecastWeatherDisplay;
import ro.mindit.training.designpatterns.weather.displays.StatisticsWeatherDisplay;
import ro.mindit.training.designpatterns.weather.displays.WeatherDisplay;

public class WeatherApp {

    public static void main(String[] args) throws InterruptedException {

        EnhancedWeatherData weatherData = new EnhancedWeatherData();

        WeatherDisplay current = new CurrentConditionsWeatherDisplay();
        WeatherDisplay forecast = new ForecastWeatherDisplay();
        WeatherDisplay stats = new StatisticsWeatherDisplay();

        weatherData.registerObserver(current);
        weatherData.registerObserver(forecast);

        for (int i = 0; i < 10; i++) {
            if (i == 3) {
                weatherData.registerObserver(stats);
            }

            if (i == 5) {
                weatherData.removeObserver(forecast);
            }

            weatherData.readMeasurementsFromWeatherStation(10 + i, 20 + i, 3);
        }
    }
}
