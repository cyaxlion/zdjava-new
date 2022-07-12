package hotel;

import java.util.List;

public class UserService {
    public Hotel hotel = null;
    public UserService(Hotel hotel) {
        this.hotel = hotel;
    }


    public List<Room> getRooms() {
        return hotel.rooms;
    }
    public List<Room> getFreeRooms() {
        return hotel.rooms.stream().filter(h -> !h.isOccupied).toList();
    }
    public boolean reserve(Integer id) {
        if(this.hotel.rooms.get(id).isOccupied) return false;
        this.hotel.rooms.set(id, this.hotel.rooms.get(id).setOccupied(true));
        return true;
    }
    public boolean free(Integer id) {
        if(!this.hotel.rooms.get(id).isOccupied) return false;
        this.hotel.rooms.set(id, this.hotel.rooms.get(id).setOccupied(false));
        return true;
    }



}
