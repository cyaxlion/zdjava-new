package observer.weather;

import java.util.ArrayList;
import java.util.List;

public class Weather implements Observable {
    private String cityName;
    private WeatherStatus status = WeatherStatus.SUNNY;

    public Weather(String cityName) {
        this.cityName = cityName;
    }

    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    public WeatherStatus getStatus() {
        return status;
    }

    public Weather setStatus(WeatherStatus status) {
        this.status = status;
        return this;
    }

    public List<Observer> observerList = new ArrayList<>();
    @Override
    public void addObserver(Observer observer) {
        this.observerList.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        this.observerList.remove(observer);

    }

    @Override
    public void notifyAllObservers() {
        for (Observer observer : this.observerList) {
            observer.update(this);
        }
//        this.observerList.forEach(element -> element.update(this));
    }
}
