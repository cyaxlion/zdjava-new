package hotel;

public class Room {
    public Integer roomNumber = null;
    public Integer capacity = null;
    public boolean hasBathroom = false;
    public boolean isOccupied = false;
    public Room(Integer roomNumber, Integer capacity, boolean hasBathroom) {
        this.roomNumber = roomNumber;
        this.capacity = capacity;
        this.hasBathroom = hasBathroom;
        this.isOccupied = false;
    }
    public Room setOccupied(boolean isOccupied) {
        this.isOccupied = isOccupied;
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

