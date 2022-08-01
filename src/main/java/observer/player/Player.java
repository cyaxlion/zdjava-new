package observer.player;

import java.util.ArrayList;
import java.util.List;

public class Player implements Observable {
    public String name;
    public Status status;
    private List<Observer> observerList = new ArrayList<>();

    public Player(String name, Status status) {
        this.name = name;
        this.status = status;
    }

    @Override
    public void addObserver(Observer observer) {
        this.observerList.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        this.observerList.remove (observer);
    }

    @Override
    public void notifyAllObservers() {
        this.observerList.forEach(element -> {
            element.update(this);
        });
    }
    public Status getStatus() {
        return status;
    }
    @Override
    public String toString() {
        return "Player {" +
                "name='" + name + '\'' +
                ", status=" + status +
                '}';
    }
    public void setStatus(Status status) {
        this.status = status;
    }
    public void update(Status status) {
        setStatus(status);
        notifyAllObservers();
    }
}
