package WeatherStation;

public class StatisticsDisplay implements Observer, DisplayElement {
    private float minTemperature = 200;
    private float maxTemperature = 0.0f;
    private float temperaturesSum = 0.0f;
    private int numberOfReadings = 0;
    private final Subject weatherData;

    public StatisticsDisplay(WeatherData weatherData) {
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }

    @Override
    public void update(float temperature, float humidity, float pressure) {
        if (temperature < minTemperature) {
            minTemperature = temperature;
        }

        if (temperature > maxTemperature) {
            maxTemperature = temperature;
        }

        temperaturesSum += temperature;
        ++numberOfReadings;

        display();
    }

    @Override
    public void display() {
        System.out.println("Min/Max/Average temperature = " + minTemperature + "/" + maxTemperature
                + "/" + (temperaturesSum / numberOfReadings));
    }
}
