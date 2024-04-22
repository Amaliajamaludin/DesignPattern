package ObserverPattern;

public class ForecastDisplay implements Observer, DisplayElement {
    private float currentPressure;
    private float lastPressure;
    @SuppressWarnings("unused")
    private WeatherData weatherData;

    public ForecastDisplay(WeatherData weatherData) {
        this.weatherData = weatherData;
        // weatherData.registerObserver(this);
    }

    public void update(float temp, float humidity, float pressure) {
        lastPressure = currentPressure;
        currentPressure = pressure;
        display();
    }

    public void display() {
        System.out.println("Forecast: Current pressure is " + currentPressure + ", Last pressure was " + lastPressure);
    }
}
