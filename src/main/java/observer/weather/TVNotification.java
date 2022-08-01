package observer.weather;

public class TVNotification implements Observer{

    @Override
    public void update(Weather weather) {
        System.out.println("TV Weather broadcast: ");
        System.out.println("Weather update in " + weather.getCityName() + ": " + weather.getStatus());
    }
}
