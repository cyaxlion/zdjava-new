package hotel;

import java.util.Random;

public class Room {
    public Integer roomNumber = null;
    public Integer capacity = null;
    public boolean hasBathroom = false;
    public boolean isOccupied = false;
    public boolean isClean;
    public Room(Integer roomNumber, Integer capacity, boolean hasBathroom) {
        this.roomNumber = roomNumber;
        this.capacity = capacity;
        this.hasBathroom = hasBathroom;
        this.isOccupied = false;
        this.isClean = new Random().nextBoolean();
    }
    public Room setOccupied(boolean isOccupied) {
        this.isOccupied = isOccupied;
        return this;
    }
    public Room setClean(boolean isClean) {
        this.isClean = isClean;
        return this;
    }

    @Override
    public String toString() {
        return "Room{" +
                "roomNumber=" + roomNumber +
                ", capacity=" + capacity +
                ", hasBathroom=" + hasBathroom +
                ", isOccupied=" + isOccupied +
                '}';
    }
}

