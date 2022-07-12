package hotel;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Hotel {
    public List<Room> rooms = new ArrayList<>();
    int LOWEST_CAPACITY = 1;
    int HIGHEST_CAPACITY = 4;
    Random r = new Random();
    public Hotel() {
        for(int i=1; i<=15; i++) {
            Room room = new Room(i, r.nextInt(HIGHEST_CAPACITY - LOWEST_CAPACITY) + LOWEST_CAPACITY, r.nextBoolean());
            rooms.add(room);
            System.out.println(room);
        }

    }
}
