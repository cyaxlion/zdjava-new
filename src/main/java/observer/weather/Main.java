package observer.weather;

public class Main {

    public static void main(String[] args) {
        Weather weather = new Weather("Wrocław");
        TVNotification observer = new TVNotification();
        observer.update(weather.setStatus(WeatherStatus.RAIN));
        observer.update(weather.setStatus(WeatherStatus.CLOUDY));
        observer.update(weather.setStatus(WeatherStatus.SNOW));
        observer.update(weather.setStatus(WeatherStatus.STORM));


    }
}
